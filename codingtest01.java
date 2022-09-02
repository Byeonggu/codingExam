package test01;

public class codingtest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		int rPoint=0;
        int tPoint=0;
        int cPoint=0;
        int fPoint=0;
        int jPoint=0;
        int mPoint=0;
        int aPoint=0;
        int nPoint=0;
        System.out.println(survey.length);
        for(int i = 0; i<survey.length; i++){
        	System.out.println(survey[i].substring(1,2));
            if(choices[i]<4){
                if(survey[i].substring(0,1).equals("R")){
                    rPoint += choices[i]; 
                }else if(survey[i].substring(0,1).equals("T")){
                    tPoint += choices[i];
                }else if(survey[i].substring(0,1).equals("C")){
                    cPoint += choices[i];
                }else if(survey[i].substring(0,1).equals("F")){
                   fPoint += choices[i];
                }else if(survey[i].substring(0,1).equals("J")){
                    jPoint += choices[i]; 
                }else if(survey[i].substring(0,1).equals("M")){
                    mPoint += choices[i]; 
                }else if(survey[i].substring(0,1).equals("A")){
                    aPoint += choices[i]; 
                }else if(survey[i].substring(0,1).equals("N")){
                    nPoint += choices[i];
                }
            }else if(choices[i]>4){
                if(survey[i].substring(1,2).equals("R")){
                    rPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("T")){
                    tPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("C")){
                    cPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("F")){
                    fPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("J")){
                    jPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("M")){
                    mPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("A")){
                    aPoint += choices[i];
                }else if(survey[i].substring(1,2).equals("N")){    
                    nPoint += choices[i];
                }
            }
        }        
        String answer = "";
        if(rPoint >= tPoint){
            answer += "R";
        }else if(rPoint < tPoint){
            answer += "T";
        }
        
        if(cPoint>= fPoint){
            answer += "C";
        }else if(cPoint < fPoint){
            answer += "F";
        }
        
        if(jPoint>= mPoint){
            answer += "J";
        }else if(jPoint < mPoint){
            answer += "M";
        }
        
        if(aPoint>= nPoint){
            answer += "A";
        }else if(aPoint < nPoint){
            answer += "N";
        }
        
        
	}
}
