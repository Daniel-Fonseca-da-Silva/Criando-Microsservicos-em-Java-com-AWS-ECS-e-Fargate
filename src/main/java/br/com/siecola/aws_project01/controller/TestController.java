package br.com.siecola.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/name/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Test controller - name: {}", name);
        return ResponseEntity.ok("Name: " + name);
    }

    @GetMapping("/dog/color")
    public ResponseEntity<?> dogColor() {
        LOG.info("color of your dog!");
        return ResponseEntity.ok("Always black!");
    }

    @GetMapping("/dog/id/{id}")
    @ResponseBody
    public ResponseEntity<?> getId(@PathVariable("id") String id) {
        LOG.info("The id of your dog is - id: {}", id);
        return ResponseEntity.ok().body(id);
    }

    @GetMapping("/dog/age/{age}")
    @ResponseBody
    public ResponseEntity<?> GetName(@PathVariable("age") Long age) {
        LOG.info("The age of your dog is - age: {}",  age);
        return ResponseEntity.ok().body(age);
    }
}
