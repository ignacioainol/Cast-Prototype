package prototype2.example.com.prototype20.Cards;

/**
 * Created by ignacioainolrivera on 01-01-18.
 */

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    public cards(String userId, String name, String profileImageUrl){
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl){
        this.profileImageUrl = profileImageUrl;
    }
}
