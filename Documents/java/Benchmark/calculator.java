public class calculator{


public static void printArray(int[] array){
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
}

public static void printArray(char[] array){
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
}

public static void printArray(int[][] array){
int i,j;
System.out.println();
for(i=0; i<array.length;i++){
for(j=0; j<array[0].length;j++){
System.out.print(array[i][j]+"\t");
}
System.out.println();
}
}

public static int[] naturalArray(int size){
int[]array = new int[size];
for(int i=0;i<array.length;i++)
array[i]=i+1;
return array;
}

public static int[] randomIntArray(int size){
int[]array= new int[size];
for(int i=0;i<size;i++)
array[i]= (int)(Math.random()*100);
return array;
}

public static int sumOfArray(int[] array){
int sum=0;
for(int i=0;i<array.length;i++)
sum =sum + array[i];
return sum;
}

public static int[] evenArray(int from, int to){
int[]array = new int[((to-from)/2)+1];
int pos=0;
for(int i=from; i<=to;i++){
if(i%2==0){
array[pos]=i;
pos++;
}
}
return array;
}

public static int[] oddArray(int from, int to){
int[]array = new int[((to-from)/2)+1];
int pos=0;
for(int i=from; i<=to;i++){
if(i%2!=0){
array[pos]=i;
pos++;
}
}
return array;
}

public static int[] primeArray(int from, int to){
int count=0,flag=0;
for(int i=from;i<=to;i++) {
flag=0;
for(int j=2;j<i;j++){
if(i%j==0){
flag=1;
break;
}
}
if(flag==1)
continue;
else
count++;
}
System.out.println();
int[]array=new int[count];
int index=0;
for(int i=from;i<=to;i++) {
flag=0;
for(int j=2;j<i;j++){
if(i%j==0){
flag=1;
break;
}
}
if(flag==1)
continue;
else{
array[index]=i;	
index++;
}
}
return array;
}

public static int[] fibonacciArray(int terms){
int[] array = new int[terms];
int sum=0,tmp=0,first=0;
for(int i=0;i<terms;i++){
if(sum<1){
sum=sum+i;
}
else{
tmp=sum;
sum=sum+first;
first=tmp;
}
array[i]=sum;
}
return array;
}

public static char[] randomCharArray(int size){
char[]array = new char[size];
char z;
for(int i=0;i<size;){
z = (char)(Math.random()*1000);
if((z>='a' && z<='z') || (z>='A' && z<='Z')){
array[i]= z;
i++;
}
}
return array;
}

public static int[] reverseArray(int[] array){
int tmp;
System.out.println();
for(int i=0,j=array.length-1;i<array.length/2;i++,j--){
tmp=array[i];
array[i]=array[j];
array[j]=tmp;
}
return array;
}

public static char[] reverseArray(char[] array){
char tmp;
System.out.println();
for(int i=0,j=array.length-1;i<array.length/2;i++,j--){
tmp=array[i];
array[i]=array[j];
array[j]=tmp;
}
return array;
}

public static int numberOfVowels(char[] array){
char tmp ;
int count=0;
for(int i=0;i<array.length;i++){
tmp = array[i];
if(tmp=='a'||tmp=='e'||tmp=='o'||tmp=='i'||tmp=='u'||tmp=='A'||tmp=='E'||tmp=='O'||tmp=='I'||tmp=='U')
count++;
}
return count;
}

public static int[][] multiplyMatrices(int[][] array1, int[][] array2){
int[][] array3= new int[array1.length][array2[0].length];
int sum,i,j;
for(i=0;i<array1.length;i++){
for(j=0;j<array2[0].length;j++){
sum=0;
for(int k=0;k<array1[0].length;k++){
sum = sum+array1[i][k]*array2[k][j];
}
array3[i][j]=sum;
}
}
return array3;
}

public static int[] doBubbleSort(int[] array) {
int tmp;
for(int i=0;i<array.length;i++) {
for(int j=1;j<array.length;j++) {
if(array[j-1]>array[j]) {
tmp=array[j];
array[j]=array[j-1];
array[j-1]=tmp; 
}
}
}
return array;
}

public static int[] doInsertionSort(int[] array) {
int tmp; 
for (int i,j = 1; j <array.length; j++) {
tmp = array[j];
i = j-1;
while ( (i > -1) && ( array [i] > tmp ) ) {
array [i+1] = array [i];
i--;
}
array[i+1] = tmp;
}
return array;
}

public static int[] doSelectionSort(int[] arr) {
for (int i = 0; i < arr.length - 1; i++) {
int index = i;
for (int j = i + 1; j < arr.length; j++){
if (arr[j] < arr[index]) 
index = j;
}   
int smallerNumber = arr[index];  
arr[index] = arr[i];
arr[i] = smallerNumber;
}
return arr;
}

public static int[] doQuickSort(int[] arr) {
int i=0,j=arr.length,pivot=(i-j)/2,tmp=0;
while(i<=j) {
while(arr[i]<pivot)
i++;
while(arr[j]>pivot)
j--;
if(i<=j){
tmp=arr[i];
arr[i]=arr[j];
arr[j]=tmp;
i++;
j--;
}





public static int[] copyArray(int[] array1,int[] array2) {
for(int i=0;i<array2.length;i++) {
array1[i]=array2[i];
}
return array1;
}
}







