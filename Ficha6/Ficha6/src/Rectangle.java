public class Rectangle extends Shape{


    private double height;
    private double width;

    public Rectangle(){
        position=new Point();
        this.height=0;
        this.width=0;
    }



    public Rectangle(Point topLeftPoint,double height, double width){
        position=topLeftPoint;
        this.height=height;
        this.width=width;
    }

    public Point getTopLeftPoint(){
        return position;
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
        position = topLeftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    @Override
    public double perimetro() {
        return ((height+height)+(width+width));
    }

    @Override
    public double area() {
        return (height*width);
    }


    public boolean contain(Point p){
        Point bottomLeftPoint=new Point((position.getX()),(position.getY()-height));
        Point bottomRightPoint=new Point((bottomLeftPoint.getX()+width),(bottomLeftPoint.getY()));
        Point topRightPoint=new Point((bottomRightPoint.getX()),(position.getY()));
        boolean contain=false;
        if(p.getX()> position.getX() && p.getX() < topRightPoint.getX() && p.getY()> bottomLeftPoint.getY() && p.getY()<topRightPoint.getY()){
            contain=true;

        }
        return contain;
    }

    @Override
    public String toString(){
        return getClass().getName()+" TopLeftPoint: " + position.toString() + "Width: "+ this.width + "Height: "+ this.height;
    }

}
