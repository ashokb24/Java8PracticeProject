package com.poc.java8lab.MethodReference;

@FunctionalInterface
interface StringJoiner {
    public String concatTwoStrings(String str1, String str2);
}

@FunctionalInterface
interface InstanceMethodReference {
    public int stringLengthIdentifier(String testString);
}

@FunctionalInterface
interface ConstructorReference{
    MethodReferenceExample getConstructor(String str);
}

public class MethodReferenceExample {

    public MethodReferenceExample(String str){
        System.out.println("String in constructor "+str);
    }

    public static void main(String[] args) {
        StringJoiner str = MethodReferenceExample::joinTwoStrings;
        System.out.println(str.concatTwoStrings("Ashok", " Bhadrappa"));

        InstanceMethodReference instanceMethodReference = new MethodReferenceExample("TestString")::findStringLength;
        System.out.println(instanceMethodReference.stringLengthIdentifier("Aeroplane"));

        ConstructorReference constructorReference = MethodReferenceExample::new;
        constructorReference.getConstructor("TestString");
    }

    public static String joinTwoStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    public int findStringLength(String testString) {
        return testString.length();
    }

}
