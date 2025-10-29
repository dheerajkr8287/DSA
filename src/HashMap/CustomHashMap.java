package HashMap;

import java.util.LinkedList;

public class CustomHashMap {
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float   DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){ //N= capacity /size of bucket array
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

        }
        private int n;// number of entries in map
        public int size(){ //return the number of entries in map
            return n;
        }

        private int HashFunc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float loafFactor(){
            return (n*1.0f)/buckets.length;
        }


        private void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length * 2);
            n=0;
            for (var bucket:oldBuckets){
                for (var node:bucket){
                    put(node.key,node.value);
                }
            }

        }

        //transverse the ll and looks for a node with key , if found it return it index otherwise null
        private int searchInBucket(LinkedList<Node> ll,K key){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public void put(K key,V  value){   //insert /update
            int bi=HashFunc(key);
            LinkedList<Node> currentBucket =buckets[bi];
            int ei=  searchInBucket(currentBucket,key);
            if (ei== -1){ //key doesn't exist ,we have to insert a new node
                Node node=new Node(key,value);
                currentBucket.add(node);
                n++;


            }else {
                Node currNode=currentBucket.get(ei);
                currNode.value=value;
            }
            if (n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public  V get(K key){
            int bi= HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei != -1){ //key exists
                Node currNode=currBucket.get(ei);
                return  currNode.value;
            }
            //key doesn't exist
            return  null;

        }

        public V remove(K key){

            int bi = HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){ //key exists
                Node currNode=currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return  val;
            }

            return  null;

        }



    }


    public static void main(String[] args) {

        MyHashMap<String,Integer> h1=new MyHashMap<>();
        System.out.println("testing map in put");
        h1.put("a",1);
        h1.put("b",2);
        h1.put("c",3);
        h1.put("d",88);
        h1.put("e",66);
        System.out.println("size:"+h1.size());
        h1.put("c",66);
        System.out.println("size:"+h1.size());


        System.out.println("testing the get");
        System.out.println(h1.get("d"));
        System.out.println(h1.get("e"));
        System.out.println(h1.get("c"));
        System.out.println(h1.get("abc"));

        System.out.println("testing remove");
        System.out.println(h1.remove("c"));
        System.out.println(h1.remove("c"));
        System.out.println(h1.size());

        System.out.println("capacity: "+h1.capacity());
        System.out.println("load:"+h1.loafFactor());


    }
}
