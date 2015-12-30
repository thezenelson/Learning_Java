public class item{
  public String activity;
  public String date;
  public String location;

  public item(String whatToDo,String whereToDoIt, String whenToDoIt ){
    this.activity = whatToDo;
    this.location = whereToDoIt;
    this.date = whenToDoIt;

  }

  public String printItem(){
    String item = "activity: " + activity + ", location: " + location + ", time/date:" + date;
    return item;
  }
}
