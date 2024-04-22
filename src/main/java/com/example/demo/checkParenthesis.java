//package com.example.demo;
//
//import com.example.demo.Entity.Stack;
//
//public class checkParenthesis {
//    boolean isBalanced(String exp) {
//        Stack stk = Stack(exp.length());
//        String openingbraces = "[{(";
//        String closingbraces = "]})";
//        for (int i = 0; i < exp.length(); i++) {
//            char  bracket = exp.charAt(i);
//            //checking open bracket
//            if(bracket=='['||bracket=='{'||bracket=='(') {
//                //confirmed opening bracket
//               stk.push(bracket);
//
//            }
//            else{
//                //confirmed closing brackets
//                int indx= closingbraces.indexOf(bracket);
//                char crossOpeningbracket = openingbraces.charAt(indx);
//                if(stk.isEmpty()){
//                    return false;
//                }
//                else {
//                  char stkchar = stk.pop();
//                  if(stkchar !=crossOpeningbracket){
//                      return false;
//                  }
//                  return true;
//
//                }
//                public static void main(String[] args){
//                    checkParenthesis test = new checkParenthesis();
//                    System.out.println(test.isBalanced("{()}"));
//                }
//            }
//
//        }
//
//    }
//}
