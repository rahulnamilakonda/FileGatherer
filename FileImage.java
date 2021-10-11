//package fileimage;
import java.io.File;
import java.util.Scanner;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Date;
import java.nio.file.Files;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
class FFilter implements FilenameFilter
{
    String ext;
    FFilter(String ext)
    {
        this.ext=ext;
    }
    @Override
    public boolean accept(File f1,String ext1)
    {
        return ext1.toLowerCase().endsWith(ext);
    } 
}
public class FileImage {
    static Queue <File> gfp =new LinkedList <>();
    static String ext;
    static String root;
    static String desta;
    
    //static File f1=new File;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Queue <File> fp =new LinkedList <>();
        String root;
        System.out.println("Enter the File OR Parent Dir or Root Dir: ");
        root=sc.nextLine();
        File f1=new File(root);
        for(File lp:f1.listFiles())
        {  
            if(!lp.isHidden())
            System.out.println(" "+lp);
           
        }
        System.out.println("Enter the Extension: ");
//        String ext;
        ext=sc.nextLine();
        System.out.println("Enter the Destination: ");
        desta=sc.nextLine();
        ListFiles(f1);
        Filee Af=new Filee();
       /* FileFilter dirfilter = new FileFilter()
        {
            public boolean accept(File file,String ext)
            {
                String name = null;
                return file.name.toLowerCase().endsWith(ext);
            }
        };*/
//        FFilter f=new FFilter(ext);
//        for(File file:f1.listFiles(f))
//        {
//            System.out.println(" "+file);
//           //new Data(file.lastModified());
//            fp.add(file);
//        }
//        String ext1=ext.substring(1);
//         File test;
//        test=new File("C:\\Users\\N.K.SAHITHI RAHUL\\Downloads\\One\\"+ext1);
//         
//            if(test.mkdir())
//            {
//                System.out.println("Dir Created: "+ext1);
//                
//            }
//            else
//            {
//                System.out.println("Already Existing Copying");
//            }
//        //test=new File(test.getName()+"\\");
//            
//        System.out.println("-----------------------------------------");
//        for(File Qfiles:fp)
//        {
//            System.out.println(""+Qfiles);
//            //String year;
//            //String Fobj=Qfiles.toString();
//           
//            File dest=new File(test+"\\"+Qfiles.getName());
//            //Pdf
//            
//            
//            try
//           {
//          Files.copy(Qfiles.toPath(),dest.toPath());
//           }catch(Exception e){}    
//         
//        }
//        
//        System.out.println("Copied Succesfully");
        
}
     static void ListFiles(File f1)
    {
        //String str;
        System.out.println(f1.getName());
//        for(File sf:f1.listFiles())
//        {
//            System.out.println(" "+sf); 
//            gfp.add(sf);
//            
//        }
         FFilter f=new FFilter(ext);
      try
      {for(File file:f1.listFiles(f))
       {   
           if(!file.isHidden())
           {System.out.println(" "+file);
          //new Data(file.lastModified());
           gfp.add(file);
           }
       }
      }
      catch(NullPointerException e)
      {
          System.out.println("Handled Exception\n");
      }
         String ext1=ext.substring(1);
         File test;
        test=new File(desta+"\\"+ext1);
        
            if(test.mkdir())
            {
                System.out.println("Dir Created: "+ext1);
                
            }
            else
            {
                System.out.println("Already Existing Copying");
            }
        //test=new File(test.getName()+"\\");
            
        System.out.println("-----------------------------------------");
        for(File Qfiles:gfp)
        {
            //System.out.println(""+Qfiles);
            String year;
            String Fobj=Qfiles.toString();
            SimpleDateFormat sd=new SimpleDateFormat("yyyy");
            String yearr=sd.format(Qfiles.lastModified());
            File ye=new File(test+"\\"+yearr);
            if(ye.mkdir())
            {
                System.out.println("Directory Created: "+yearr);
            }
           
            //File dest=new File(test+\\"+Qfiles.getName());
            File dest=new File(ye+"\\"+Qfiles.getName());
            //Pdf
            
            
            try
           {
          Files.copy(Qfiles.toPath(),dest.toPath());
           }catch(Exception e){}    
         
        }
        
        System.out.println("Copied Succesfully");
        FileFilter dirfilter=new FileFilter()
        {
            public boolean accept(File file)
            {
                return file.isDirectory();
            }
        };
        try
        {
        for(File di:f1.listFiles(dirfilter))
        {
            if(!di.isHidden())
                ListFiles(di);
        }
        }catch(NullPointerException ne)
        {
            System.out.println("Exception Handled\n");
        }
                                
    }
    
}





























































































































class Filee
{
    Filee()
    {
        System.out.println("----------------------------");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t|");
        System.out.println("Written By Namilakonda Rahul ");
        System.out.println("CSE-B");
       System.out.println("|\t\t\t\t\t\t|");
       System.out.println("|\t\t\t\t\t\t|");
       System.out.println("|\t\t\t\t\t\t|");
       System.out.println("|\t\t\t\t\t\t|");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
    }
}