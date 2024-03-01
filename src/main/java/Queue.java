Public static queue<T> inQueue(Queue<T> q){
Queue<T> q1 = new Queue<T>();
Queue<T> q2 = new Queue<T>();
While(!q.isEmpty()){
T x =q.remove;
q1.insert(x);
q2.insert(x);
}
While(!q2.isEmpty()){
T a =q2.remove();
q.insert(a);
} 
Return q1;
}


Public static <T> Boolean isSeq(Queue<T> q1, T b){
Queue<T> q = inqueue(q1);
Int count=0,max=0;
While(!q.isEmpty()){
T currvalue = q.remove();
If(currvalue==b){
 Count++;
}
If(count>max)
max=count;
else{
count = 0;
}
}
if(max>1){
return true;
}
return false;
}

Public static queue<T> inQueue(Queue<T> q){
Queue<T> q1 = new Queue<T>();
Queue<T> q2 = new Queue<T>();
While(!q.isEmpty()){
T x =q.remove;
q1.insert(x);
q2.insert(x);
}
While(!q2.isEmpty()){
T a =q2.remove();
q.insert(a);
} 
Return q1;
}


Public static Boolean isinQueue(Queue<Integer> q, int n){
Queue<Integer> q1 = inqueue(q);
While(!q1.isEmpty()){
if(q1.remove==n)
return true;
}
return false;
}
Public static void remove(Queue<Integer> q){
Queue<Integer> temp = new Queue<Integer>();
Int x;
While(!q.isEmpty()){
 x = q.remove();
If(!isinQueue(temp,x)){
temp.insert(x);
}
}
while(!temp.isEmpty()){

q.insert(temp.remove());
}
}




