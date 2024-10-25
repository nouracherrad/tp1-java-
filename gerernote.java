package org.example;
import java.util.Arrays;
public class gerernote {
    public  float[] trierAfficher( float[] tab){
        Arrays.sort(tab);
        return tab;
    }
    public float noteMoy(float[] tab){
        float sum=0;
        for (float s:tab){
            sum+=s;
        }
        float nmoy=sum/tab.length;
        return nmoy;
    }
    public  float affichermax(float[] tab){
        float max = 0;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i]<tab[i+1]){
                max=tab[i+1];}
            else{
                max=tab[i];}

    }return max;
    }
    public float affichermin(float[] tab) {
        float min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }}
        return min;
    }


public  int nbrEtudiant(float[] tab) {
    int counteur = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i]!=0) {counteur++;}
    } return  counteur;
}
}



