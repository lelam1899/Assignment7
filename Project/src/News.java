
public class News implements INews {
   public int Id;
   public String Title;
   public String PublishDate;
   public String Author;
   public String Content;
   public double AverageRate;
   public int[] RateList = new int[3];

   public News(int Id, String title, String publishDate, String author, String content, int[] rateList){
       this.Id = Id;
       this.Title = title;
       PublishDate = publishDate;
       Author = author;
       Content = content;
       for (int i = 0; i<3; i++){
           RateList[i] = rateList[i];
       }
   }


    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public double getAverageRate() {
        return AverageRate;
    }

    public void setId(int Id ) {
        this.Id= Id;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }
    @Override
    public void Display() {
        System.out.println(Title+ "" +PublishDate+ "" +Author+ ""+Content+""+AverageRate);
    }

    public void Calculate(){
        double sum = 0.0;
        for(int i = 0; i < this.RateList.length; i++) {
            sum += this.RateList[i];
        }
       this.AverageRate = sum/this.RateList.length;
    }
}
