package com.example.RestWebService;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //Part-2-Q7. In swagger documentation, add the description of each class and URI so that in swagger UI the purpose of class and URI is clear.
    public static final Contact DEFAULT_CONTACT = new Contact("Vinay Parida", "something.link.com", "vinay.parida099@gmail.com");
    private static final ApiInfo DEFAULT_API_INFO =  new ApiInfo("Api Swaggger Documentation", "Api Documentation for Swagger Documentation", "1.0", "urn:tos",
            DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");


    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("applications/json", "applications/xml"));   //Shows that the API takes both JSON and XML as input and give output iin


//    Part-2-Q5 Configure swagger plugin and create document of following methods:
//      a) Get details of User using GET request.
//      b) Save details of the user using POST request.
//      c) Delete a user using DELETE request.

    @Bean
    public Docket api(){                                       //Docket gives a way to use the Swagger, here we are using the Swagger Documentation type
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES);

    }

    @Bean
    public LinkDiscoverers discoverers() {                       //LinkDiscoveres registers all urls in Spring registery
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));

    }
}