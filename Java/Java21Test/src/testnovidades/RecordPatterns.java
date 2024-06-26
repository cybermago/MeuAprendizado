package testnovidades;

public record RecordPatterns() {
    public static void main(String[] args){
     /*   var obj = new User("jonata","123","email@jonata");
    //Antes - Java 17
    if(obj instanceof User user){
        var username = user.username();
        var password = user.password();
        var email = user.email();
        System.out.printf("%s, %s, %s%n", username, password, email);
    }

    // Depois - Java 21
    if(obj instanceof User(String username, String password, String email)){
    System.out.printf("%s, %s, %s", username, password, email);
    }*/}}