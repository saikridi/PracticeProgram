package BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessService {
    public final DataService serviceData;
    @Autowired
    public BusinessService(DataService data){
        super();
        this.serviceData = data;
    }
    public int FindMax(){
        return Arrays.stream(serviceData.retrieveData()).max().orElse(0);
    }
}
