package clean.code.book.especification;
import lombok.AllArgsConstructor;
import java.util.Iterator;


public final class PolicySpecification {

    @AllArgsConstructor
    class CustomerSpecification {
        private String id;
        private String type;
    }

    private final long policyId;
    private final long policyNumber;
    private CustomerSpecification customerSpecification;
    public PolicySpecification(long policyId, long policyNumber) {
        //Validate.isTrue(policyId>0, "policyId can't be less than zero");
        //Validate.isTrue(policyNumber>0, "policyNumber can't be less than zero");
        this.policyId = policyId;
        this.policyNumber = policyNumber;
    }
    public void addCustomerSpecification(CustomerSpecification customerSpecitication) {
        //Validate.notNull(customerSpecitication, "specification can't be null");
        this.customerSpecification = customerSpecitication;
    }
    //public Iterator<Filter> toFilter() {
    //    //regresar el filtro, puede ser un mapa u otro objeto plano
    //    return null;
    //}

    public Iterator findBySpecification(PolicySpecification specification) {
        return null;
    }
    public Iterator findOneBySpecification(PolicySpecification specification) {
        //Iterator it = findBySpecifiction(specification);
        //if(it.hasNext()) {
        //    return it.next();
        //}
        return null;
    }

}