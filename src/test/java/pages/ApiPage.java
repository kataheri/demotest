package pages;

import helper.EndPoint;

public class ApiPage {

    String setURL;


    public void prepareUrlFor(String url){
        switch (url){
            case "USER_GOREST":
                setURL = EndPoint.GET_LIST_USERS;
                break;
            case "CREATE_USER":
                setURL = EndPoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USER":
                setURL = EndPoint.DELETE_USERS;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("endpoint yang siap pakai: " + setURL);
    }
    public void hitApiForGetListUsers(){
        System.out.println("HitApiForGetListUsers");
    }
    public void validationStatusCodeIsEqual(){
        System.out.println("validationStatusCodeIsEqual");
    }
    public void validationResponseBodyGetListUsers(){
        System.out.println("validationResponseBodyGetListUsers");
    }
    public void validationResponseJsonWithJSONSchema(){
        System.out.println("validationResponseJsonWithJSONSchema");
    }
}
