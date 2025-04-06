package car.example.bean;

public class Mybean {
    private String msg;

    //setter , name matters it should be set then instance variable name, else error
    // spring context invokes setter method to set the instance variable, hence it is mandatory
    // msg is the property name that is instance variable name
    //setmsg or setMsg both works, setMsg preferred
    public void setMsg(String message){
        this.msg=message;
    }

    //using instance variable msg, no need to pass it
    public void showMessage(){
        System.out.println("Message: " + msg);
    }

    @Override
    public String toString() {
        return "Mybean{" +
                "message='" + msg + '\'' +
                '}';
    }


}
