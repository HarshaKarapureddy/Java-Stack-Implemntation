public class Stack {
private LINKED s;
public Stack()
{
s = new LINKED();
}
public boolean isEmpty()
{
return s.lengthIs()==0;
}
public int sizeIs()
{
return s.lengthIs();
}
public void push(String sth)
{
s.addToHead(sth);
}
public String peek()
{
if(isEmpty())
return null;
s.reset();
return s.getNext();
}
public String pop()
{
if(isEmpty())
return null;
// String temp = peek();
return s.deleteFromHead();
}
}

