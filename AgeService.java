package ageservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "getAge")
public class AgeService implements generated.ageservice.AgeService {

    @WebMethod
    public String getAge(Integer arg0) {
        return "Votre âge est de " + (Year.now().getValue() - arg0) + "ans";
    }
}
