public class Rectangle {

    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle(){
        this.topLeftPoint=new Point();
        this.height=0;
        this.width=0;
    }

    public Rectangle(Point topLeftPoint,double height, double width){
        this.topLeftPoint=topLeftPoint;
        this.height=height;
        this.width=width;
    }

    public Point getTopLeftPoint(){
        return this.topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   public double area(){
        return (height*width);
   }

   public double perimetro(){
        return ((height+height)+(width+width));
   }

   public boolean contain(Point p){
        Point bottomLeftPoint=new Point((topLeftPoint.getX()),(topLeftPoint.getY()-height));
        Point bottomRightPoint=new Point((bottomLeftPoint.getX()+width),(bottomLeftPoint.getY()));
        Point topRightPoint=new Point((bottomRightPoint.getX()),(topLeftPoint.getY()));
        boolean contain=false;
        if(p.getX()> topLeftPoint.getX() && p.getX() < topRightPoint.getX() && p.getY()> bottomLeftPoint.getY() && p.getY()<topRightPoint.getY()){
            contain=true;

        }
        return contain;
   }
}
