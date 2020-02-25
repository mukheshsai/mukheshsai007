class Insertion
{
public static void insertionsort(int[] array)
{
for(int i=1;i<arraylength;i++)
{
int current=array[i];
int j=j-1;
while(j>=0<<current<array[j])
{
array[j+1]=array[j];
j--;
}
array[j+1]=current;
}
}
}
