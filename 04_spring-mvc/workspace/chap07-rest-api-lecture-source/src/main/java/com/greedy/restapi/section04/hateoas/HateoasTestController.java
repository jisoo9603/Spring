//package com.greedy.restapi.section04.hateoas;
//
//import org.springframework.hateoas.EntityModel;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//
//@RestController
//@RequestMapping("/hateoas")
//public class HateoasTestController {
//
//    private final List<UserDTO> users;
//    private final DtoModelAssembler assembler;
//
//    public HateoasTestController(DtoModelAssembler assembler) {
//
//        users = new ArrayList<>();
//
//        users.add(new UserDTO(1, "user01", "pass01", "홍길동", new java.util.Date()));
//        users.add(new UserDTO(2, "user02", "pass02", "유관순", new java.util.Date()));
//        users.add(new UserDTO(3, "user03", "pass03", "이순신", new java.util.Date()));
//
//        this.assembler = assembler;
//    }
//
//    @GetMapping("/users/{userNo}")
//    public ResponseEntity<ResponseMessage> findUserByNo(@PathVariable int userNo) {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(
//                new MediaType("application", "json", Charset.forName("UTF-8")));
//
//        UserDTO foundUser = users.stream()
//                .filter(user -> user.getNo() == userNo)
//                .collect(Collectors.toList())
//                .get(0);
//
//        Map<String, Object> responseMap = new HashMap<>();
//        responseMap.put("user", foundUser);
//
//        return ResponseEntity
//                .ok()
//                .headers(headers)
//                .body(new ResponseMessage(200, "조회 성공!", responseMap));
//    }
//
////    @GetMapping("/users")
////    public ResponseEntity<ResponseMessage> findAllUsers() {
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setContentType(
////                new MediaType("application", "json", Charset.forName("UTF-8")));
////
//////        Map<String, Object> responseMap = new HashMap<>();
//////        responseMap.put("users", users);
////
////        List<EntityModel<UserDTO>> userWithRel =
////                users.stream().map(user -> EntityModel.of(user,
////                        linkTo(methodOn(HateoasTestController.class).findUserByNo(user.getNo())).withSelfRel(),
////                        linkTo(methodOn(HateoasTestController.class).findAllUsers()).withRel("users")
////                        )).collect(Collectors.toList());
////        Map<String, Object> responseMap = new HashMap<>();
////        responseMap.put("users", userWithRel);
////
////        return new ResponseEntity<>(
////                new ResponseMessage(200, "조회 성공!", responseMap),
////                HttpStatus.OK);
////    }
//
//    @GetMapping("users")
//    public ResponseEntity<ResponseMessage> findAllUsers() {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
//
//        List<EntityModel<UserDTO>> usersWithRel =
//                users.stream().map(user -> assembler.toModel(user))
//                        .collect(Collectors.toList());
//        Map<String, Object> responseMap = new HashMap<>();
//        responseMap.put("users", usersWithRel);
//
//        return new ResponseEntity<>(
//                new ResponseMessage(200, "조회 성공!", responseMap),
//                headers,
//                HttpStatus.OK
//        );
//    }
//}