//package com.greedy.restapi.section03.valid;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import java.sql.SQLOutput;
//import java.util.logging.ErrorManager;
//
//@ControllerAdvice
//public class ExceptionController {
//
//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e) {
//
//        String code = "ERROR_CODE_0000";
//        String description = "회원 정보 조회 실패!";
//        String detail = e.getMessage();
//
//        return new ResponseEntity<>(new ErrorResponse(code, description, detail), HttpStatus.NOT_FOUND);
//
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResponse> methodValidException(MethodArgumentNotValidException e) {
//
//        String code= "";
//        String descripton= "";
//        String detail= "";
//
//        if(e.getBindingResult().hasErrors()) {
//            detail = e.getBindingResult().getFieldError().getDefaultMessage();
//
//            String bindResultCode = e.getBindingResult().getFieldError().getCode();
//
//            System.out.println("bindResultCode = " + bindResultCode);
//            System.out.println("detail " + detail);
//        }
//
//        return new ResponseEntity<>((new ErrorManager(code, descripton, detail),HttpStatus.BAD_REQUEST);
//    }
//}
