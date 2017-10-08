public class Route{
private String startPoint;
private String endPoint;
private int cost;
private int flightTime;
public Route(String startPoint, String endPoint, int cost, int flightTime){
this.startPoint = startPoint;
this.endPoint = endPoint;
this.cost = cost;
this.flightTime = flightTime;
System.out.println("ROUTE");
}
public String getStartPoint(){
return startPoint;
}
public String getEndPoint(){
return endPoint;
}
public int getCost(){
return cost;
}
public int getFlightTime(){
return flightTime;
}
public void setStartPoint(String startPoint){
this.startPoint = startPoint;
}
public void setEndPoint(String endPoint){
this.endPoint = endPoint;
}
public void setCost(int cost){
this.cost = cost;
}
public void setFlightTime(int flightTime){
this.flightTime = flightTime;
}
}
