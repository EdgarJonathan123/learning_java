package modern.features.matching;

import java.util.Iterator;
import java.util.List;

public class PatternMatching {
     private void outputWithoutPattern(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }
    }
    private void outputWithPattern(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

    private void processWithoutPattern(Font font , int size){
        ModuleNode modules = new ModuleNode();
        final List<Node> list = modules.getChildren();

        for(Iterator<Node> i = list.iterator();i.hasNext();){
            final Object o = i.next();
            if(o instanceof LetterNode ){
                final LetterNode  letterNode = (LetterNode) o;
                if(letterNode.isLatin() && isLetterTrueFont(letterNode.getNodeValue(),font,size)){
                    i.remove();
                }
            }
        }
    }
    private void processWithPattern(Font font , int size){
        ModuleNode modules = new ModuleNode();
        final List<Node> list = modules.getChildren();
        list.removeIf(o -> o instanceof LetterNode letterNode
                && letterNode.isLatin()
                && isLetterTrueFont(letterNode.getNodeValue(),font,size));
    }

     private boolean isLetterTrueFont(String letter, Font font, int size) {
         return true;
     }
}

class Font{

}

class NodeFail extends Node {

    public void lol(){
    }
}
abstract  class Node {
    public abstract  void lol();
}

class LetterNode extends  Node{
    private String nodeValue;
    public void lol(){

    }
    public boolean isLatin(){
        return true;
    }

    public String getNodeValue() {
        return nodeValue;
    }
}

class ModuleNode {
    public List<Node> getChildren() {
        return null;
    }
}

