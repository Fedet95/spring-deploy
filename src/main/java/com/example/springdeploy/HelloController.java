package com.example.springdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World, it's nice to see you.";
    }

    @GetMapping("/")
    public String bootstrap(){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hello, world!</h1>
                    <a class="btn btn-primary" href="https://www.google.com"> Google </a>
                     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
                  </body>
                </html>
                """; //Type whatever you what without concatenate
    }
}
