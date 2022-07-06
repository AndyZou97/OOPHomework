public class Sentence{
    private String sentence;
    public Sentence(String sentence){
        this.sentence = sentence;
    }
    public String getSentence(){
        return this.sentence;
    }

    @Override
    public boolean equals(Object s1){
        Sentence s2 = (Sentence) s1;
        if(this.sentence == s2.sentence){
            return true;

        }
        else{
            return false;
        }
    }



}
