// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
       if (pw==null){
        throw new IllegalArgumentException("password can not be null");
       }
       if(pw.length() < MIN_LEN || (pw.length() >MAX_LEN)){
         return false;
       }
       boolean haslower = false;
       boolean hasupper = false;
       boolean hasnumber = false;
       for(int i = 0; i < pw.length() ; i++){
        Character c = pw.charAt(i);
        if (Character.isLowerCase(c)) haslower = true;
        else if (Character.isUpperCase(c)) hasupper = true;
        else if(Character.isDigit(pw.charAt(i)))hasnumber = true ;
            
        

       }
       return haslower && hasupper && hasnumber ;
    }
}
