package com.example.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {


    @GetMapping(value = "/usr",  produces = "application/v1+json")
    public List<UserV1> getEmployeeVersion1ByMimeTypeVersioning(){
        return Arrays.asList(new UserV1(1,"Vinay Parida", "Hno 14, Sec 27, Noida, 201301"),
                new UserV1(2, "Marc Spector", "H no. 14, Marcus Colony, Egypt, 673843"));
    }

    @GetMapping(value = "/usr", produces = "application/v2+json")
    public List<UserV2> getEmployeeVersion2ByMimeTypeVersioning(){
        return Arrays.asList(new UserV2(1, new Name("2 Vinay", "Parida"), new Address("Hno 14", "Sec 27", "Noida",201301)),
                            new UserV2(2, new Name("2 Marc", "Spector"), new Address("H no. 14", "Marcus Colony", "Egypt", 673843)));
    }



    @GetMapping(value = "/emp",  params = "version=1")
    public List<UserV1> getEmployeeVersion1ByRequestParameterVersioning(){
        return Arrays.asList(new UserV1(1,"Vinay Parida", "Hno 14, Sec 27, Noida, 201301"),
                new UserV1(2, "Marc Spector", "H no. 14, Marcus Colony, Egypt, 673843"));
    }

    @GetMapping(value = "/emp", params = "version=2")
    public List<UserV2> getEmployeeVersion2ByRequestParameterVersioning(){
        return Arrays.asList(new UserV2(1, new Name("2 Vinay", "Parida"), new Address("Hno 14", "Sec 27", "Noida",201301)),
                new UserV2(2, new Name("2 Marc", "Spector"), new Address("H no. 14", "Marcus Colony", "Egypt", 673843)));
    }




    @GetMapping(value = "/usr/v1")
    public List<UserV1> getEmployeeVersion1ByURIVersioning(){
        return Arrays.asList(new UserV1(1,"Vinay Parida", "Hno 14, Sec 27, Noida, 201301"),
                new UserV1(2, "Marc Spector", "H no. 14, Marcus Colony, Egypt, 673843"));
    }

    @GetMapping(value = "/usr/v2")
    public List<UserV2> getEmployeeVersion2ByURIVersioning(){
        return Arrays.asList(new UserV2(1, new Name("2 Vinay", "Parida"), new Address("Hno 14", "Sec 27", "Noida",201301)),
                new UserV2(2, new Name("2 Marc", "Spector"), new Address("H no. 14", "Marcus Colony", "Egypt", 673843)));
    }



    @GetMapping(value = "/usr", headers = "")
    public List<UserV1> getEmployeeVersion1ByCustomHeaderVersioning(){
        return Arrays.asList(new UserV1(1,"Vinay Parida", "Hno 14, Sec 27, Noida, 201301"),
                new UserV1(2, "Marc Spector", "H no. 14, Marcus Colony, Egypt, 673843"));
    }

    @GetMapping(value = "/usr")
    public List<UserV2> getEmployeeVersion2ByCustomHeaderVersioning(){
        return Arrays.asList(new UserV2(1, new Name("2 Vinay", "Parida"), new Address("Hno 14", "Sec 27", "Noida",201301)),
                new UserV2(2, new Name("2 Marc", "Spector"), new Address("H no. 14", "Marcus Colony", "Egypt", 673843)));
    }


}
