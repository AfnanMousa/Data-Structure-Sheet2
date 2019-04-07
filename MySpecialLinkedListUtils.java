
public class MySpecialLinkedListUtils {
  
	public static int size (LinkedListNode head)
	{
		LinkedListNode help_node=new LinkedListNode();
		 help_node=head;
		 int count=0;
		 while(help_node!=null)
		 {
			 help_node=help_node.next_node;
			 count++;
		 }
		 
		 return (count);
	}
	 public static double[]  summary(LinkedListNode head)
	 {
		 LinkedListNode help_node=new LinkedListNode();
		 help_node=head;
		 double sum=0;
		 int count=0;
		 int  max=help_node.value;
		 int  min=help_node.value;
		 while(help_node!=null)
		 {
			 sum=sum+ help_node.value;
			 help_node=help_node.next_node;
			 count++;
			 if(help_node!=null)
			 {
				 if(max<help_node.value)
				 {
					max=help_node.value;
				 }
				 if(min>help_node.value)
				 {
					min=help_node.value;
				 }
				  
			 }
			
		 }
		 double[] summary_array=new double[5];
		 if((sum==0)||(count==0))
		 {
			 summary_array[1]=0;
		 }
		 else
		 {
			
			 summary_array[1]=(sum/count);
		 }
		 double median=0;
		 if(count%2!=0)
		 {
			 LinkedListNode help_node2=new LinkedListNode(); 
			 help_node2=head;
			 int x=0;
			 while(x<(count/2))
			 {
				 help_node2= help_node2.next_node;
				 median= help_node2.value;
				 x++;
			 }
		 }
		 else
		 {
			 LinkedListNode help_node2=new LinkedListNode(); 
			 help_node2=head;
			 int x=0;
			 while(x<((count/2)-1))
			 {
				 help_node2= help_node2.next_node;
				 x++;
			 }
			 median=(help_node2.value)+(help_node2.next_node.value);
			 median=(median/2);
		 }
		 summary_array[0]=sum;
		 summary_array[3]=max;
		 summary_array[4]=min;
		 summary_array[2]=median;
		return summary_array;
	 }
	 
	  public static LinkedListNode reverse (LinkedListNode head)
	  {
		  LinkedListNode help_node3=new LinkedListNode();
		  LinkedListNode help_node4=new LinkedListNode();
		  help_node3=head.next_node;
		  head.next_node=null;
		  while(help_node3!=null)
		  {
			  help_node4=help_node3.next_node;
			  help_node3.next_node=head;
			  head=help_node3;
			  help_node3=help_node4;
		  }
		  return head;
	  }
	  
	  public static LinkedListNode evenIndexedElements (LinkedListNode head)
	  {
		  LinkedListNode help_node1=new LinkedListNode();
		  help_node1=head;
			  while(help_node1!=null)
			  {  
			    if((help_node1.next_node!=null)&&(help_node1.next_node.next_node!=null))
			    {
			   	
			     help_node1.next_node=help_node1.next_node.next_node;
			    }
			    help_node1=help_node1.next_node;
			  }
			 
		  return head;
	  }
	   
	  public static LinkedListNode removeCentralNode (LinkedListNode head)
	  {
		  LinkedListNode remove=new LinkedListNode();
		  LinkedListNode remove2=new LinkedListNode();
		  remove=head;
		  int size=size(head);
		  if(size%2!=0)
		  {
			  int i=0;
			while(i<((size/2)-1)) 
			{
				remove=remove.next_node;
				i++;
			}
			remove2=remove.next_node;
			remove.next_node=remove2.next_node;
			return head;
		  }
		  else
		  {
			 int i=0;
		     while(i<((size/2)-2))
		     {
		    	 remove=remove.next_node;
					i++;
			 }
		     remove2=remove.next_node;
			 remove.next_node=remove2.next_node;  
				return head;	  
		  }
		 
	  }
	  public static LinkedListNode insertionSort(LinkedListNode head)
	  {
		  LinkedListNode help_node=new LinkedListNode();
		  LinkedListNode help_node1=new LinkedListNode();
		  help_node=head;
		  help_node1=head;
		  while(help_node.next_node!=null)
		  {
			  int need_value=help_node.next_node.value;
			  help_node=help_node.next_node;
			  LinkedListNode help_node2=new LinkedListNode();
			  while(help_node1!=help_node)
			  {
				  if(help_node1.next_node.value>need_value)
				  {
					  LinkedListNode help_node4=new LinkedListNode();
					  LinkedListNode help_node5=new LinkedListNode();
					  help_node5.value=need_value;
					  help_node4=help_node1.next_node;
					  help_node1.next_node=help_node5;
					  help_node5.next_node=help_node4;
					  LinkedListNode help_node6=new LinkedListNode();
					  help_node6=help_node1;
					  if((help_node6!=null)&&(help_node6.next_node!=null))
					  {
						  while(help_node6.next_node!=help_node)
						  {
							  help_node6=help_node6.next_node;
						  }
						 help_node6.next_node=help_node.next_node;
					  }
					  break;
				  }
				 
				  help_node1=help_node1.next_node;
			  }
			  help_node1=head;
		  }
		  return head;
	  }
	  
    /* public static boolean palindrome(LinkedListNode head)
	  {
    	 LinkedListNode help_node=new LinkedListNode();
    	 LinkedListNode help_node1=new LinkedListNode();
    	 LinkedListNode help_node2=new LinkedListNode();
    	 help_node2=head;
    	 help_node1=head;
    	 help_node=head;
    	 int count=0;
    	 while(help_node2!=null)
    	 {
    		 help_node2=help_node2.next_node;
    		 count++;
    	 }
    	 int arr[]=new int[count];
    	 for(int i=count-1;i>=0;i--)
    	 {
    		 arr[i]=help_node1.value;
    		 help_node1=help_node1.next_node;
    	 }
    	 int j=0;
    	 int found=1;
    	 while(head!=null)
    	 {
    		 if(head.value!=arr[j])
    		 {
    			 found=0;
    		 }
    		 head=head.next_node;
    		 j++;
    	 }
    	 if(found==1)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    	 return false;
    	 }
    	 
	  }*/
	  public static boolean palindrome(LinkedListNode head)
	  {
		  LinkedListNode help_node=new LinkedListNode();
	      LinkedListNode help_node1=new LinkedListNode();
	      LinkedListNode help_node2=new LinkedListNode();
	      help_node2=head;
	      help_node=head;
		  int count=size(head);
		  int i=1;
		  while(i<count/2)
		  {
			  help_node= help_node.next_node;
			  i++;
		  }
		  if(count%2==0)
		  {
			  help_node1=help_node.next_node;  
		  }
		  else
		  {
			  help_node1=help_node.next_node.next_node;  
		  }
		  help_node.next_node=null;
		  help_node1=reverse(help_node1);
		  int found=1;
			while(help_node2!=null)
			{
				if(help_node2.value!=help_node1.value)
				{
					found=0;
				}
				help_node2=help_node2.next_node;
				help_node1=help_node1.next_node;
			}
			if(found==1)
			{
				return true;
				
			}
			else
				return false;
	  }
	  
	  public static LinkedListNode merge_two_sort_ll(LinkedListNode left,LinkedListNode right)
	  {
		  LinkedListNode help_node=new LinkedListNode();
		  if(left==null)
		  {
			  return right;
		  }
		  if(right==null)
		  {
			  return left;
		  }
		  if(right.value<=left.value)
		  {
			  help_node=right;
			  help_node.next_node=merge_two_sort_ll(left,right.next_node);
		  }
		  else
		  {
			  help_node=left;
			  help_node.next_node=merge_two_sort_ll(left.next_node,right);
		  }
		  return help_node;
	  }
	  
	  public static LinkedListNode getmedian(LinkedListNode head)
	  {
		  LinkedListNode help_node=new LinkedListNode(); 
		  LinkedListNode median=new LinkedListNode(); 
		  help_node=head;
		  int count =size (head);
		  if(count%2!=0)
		  {
			 int x=0;
			 while(x<(count/2))
			 {
			   help_node= help_node.next_node;
		   	   median= help_node;
				x++;
			 }
		 }
		  else
			{
			 int x=0;
			 while(x<((count/2)-1))
			 {
				 help_node= help_node.next_node;
				 x++;
			 }
				 median=help_node;
			 }  
		  return median;
	  }
	  
	  public static LinkedListNode mergeSort(LinkedListNode head)
	  {
		 if((head==null)||(head.next_node==null))
		 {
			 return head;
		 }
		 LinkedListNode mid=getmedian(head);
		 LinkedListNode nextmid=mid.next_node;
		 mid.next_node=null;
		 LinkedListNode right=mergeSort(nextmid);
		 LinkedListNode left=mergeSort(head);
		 LinkedListNode help_node1=merge_two_sort_ll(left,right);
		 return help_node1;
	  }
	  
}
