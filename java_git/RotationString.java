 class RotationString{
public static void main(String[] args){
System.out.println(isRotatedVersion("abcd","cdba"));
}

public static boolean isRotatedVersion(String str,String rotatedString){
if(str==null || rotatedString==null){
return false;
}else if(str.length()!=rotatedString.length()){
return false;
}else
{ 
String concatenated=str+str;
return concatenated.contains(rotatedString);
}
}
}






