//package com.greedy.restapi.section04.hateoas;
//
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.RepresentationModelAssembler;
//import org.springframework.stereotype.Component;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@Component
//public class DtoModelAssembler
//        implements RepresentationModelAssembler<UserDTO, EntityModel<UserDTO>> {
//
//    private Object dto;
//
//    @Override
//    public EntityModel<UserDTO> toModel(UserDTO entity) {
//
//        return EntityModel.of(
//                dto,
//                linkTo(methodOn(HateoasTestController.class).findUserByNo(dto.getNo))).withSelfRel(),
//                linkTo(methodOn(HateoasTestController.class).findAllUsers()).withRel("users")
//        );
//    }
//}
