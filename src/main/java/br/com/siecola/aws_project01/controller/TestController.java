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
        LOG.info("Test controller - Always black!");
        return ResponseEntity.ok("Always black!");
    }

    @GetMapping("/dog/id/{id}")
    @ResponseBody
    public ResponseEntity<?> getId(@PathVariable("id") String id) {
        LOG.info("Test controller - this is my test! with" + id);
        return ResponseEntity.ok().body(id);
    }
}
