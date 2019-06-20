package restTemplateClientExample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class RestTemplateClientExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(RestTemplateClientExampleApplication::class.java, *args)
}