    public void settInn(E e){
      int maxIndex = 0;
      int minIndex = 0;

      for(int i=0; i<beholder.length; i++){
        if(beholder[i] == null){
          beholder[i]= e;
          return;
        }
       }

       for(int i=0; i<beholder.length; i++){
         if(beholder[i]!= null){
          if(beholder[i].compareTo(beholder[maxIndex])>0){
             maxIndex = i;
          }
        }
        }
          if (beholder[maxIndex].compareTo(e)<0){
            beholder[maxIndex] = e;
          }

          for(int i=0; i<beholder.length; i++){
            if(beholder[i]!= null){
             if(beholder[i].compareTo(beholder[minIndex])<=0){
                minIndex = i;
             }
           }
           }
           if(beholder[minIndex].compareTo(e)>=0){
             beholder[minIndex] = e;
           }
       }
       }
