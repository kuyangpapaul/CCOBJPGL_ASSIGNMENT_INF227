public class App {

    static boolean iWillReviewNa  = true;
    static boolean iWillNotFailNa = true;

    public static void main(String[] args) throws Exception {
        
    App myReview = new App();

    //precondition
    assert iWillReviewNa == true: "naglaro kasi ako ng mobile legends magdamag";
   
    myReview.exam();

    //postcondition
    assert iWillNotFailNa == true: "kasi hindi ako nakapag review dahil naglaro lang ako magdamag ng ml";

    }
    void exam(){
        iWillNotFailNa = false;
        
 }
} 
