//import java.util.LinkedList;

public class LinkedList 
{
    //LinkedList<String> llTest = new LinkedList<String>();
    private NodeClass headNode;
 
    public void addNode(int x, int y)
    {
        NodeClass newNode = new NodeClass();
        newNode.xPosition = x;
        newNode.yPosition = y;
        
        newNode.nextNode = headNode;
    }
    
    public NodeClass removeNode()
    {
        NodeClass temp = new NodeClass();
        temp = headNode; 
        headNode = headNode.nextNode;
        
        return temp; 
    }
    
    public NodeClass getHeadNode()
    {
        return headNode; 
    }
    
}
