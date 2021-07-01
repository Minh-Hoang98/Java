
package P0062;

public class Path {
    String path;

    public Path() {
    }

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public String getDisk(){
        int a = path.indexOf("\\");
        return path.substring(0, a);  
    }
    
    public String getFileName(){
        int a = path.lastIndexOf("\\");
        int b = path.lastIndexOf(".");
        return path.substring(a+1, b);
    }
    
    public String getExtension(){
        int a = path.lastIndexOf(".");
        return path.substring(a+1, path.length());
    }
    
   public String getPathNe(){
        int a = path.lastIndexOf("\\");
        return path.substring(0, a);
    } 
   
   public String getFolders(){
       int a = path.indexOf("\\");
       int b = path.lastIndexOf("\\");
       return "["+path.substring(a+1, b)+"]";
   }
   
   public void display(){
       System.out.println("----- Result Analysis -----");
       System.out.println("Disk: " + this.getDisk());
       System.out.println("Extension: "+ this.getExtension());
       System.out.println("File Name: "+this.getFileName());
       System.out.println("Path: "+ this.getPathNe());
       System.out.println("Folders: "+this.getFolders());
   }
}
