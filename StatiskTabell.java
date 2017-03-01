class StatiskTabell<T> implements Tabell <T>{


/*
The constructor will take the length of the array (which is also the array's capacity) as the only parameter. 
This container will throw a Full Table Exception if the array is full when an item is attempted inserted. 
If one tries to retrieve from a place that is not a valid index in the array, or that it is not inserted anything, 
the door will be thrown a Invalid Space Exceptions.
*/

  public int storrelse()

      /**
       * Sjekker om tabellen er tom
       * @return      om tabellen er tom
       */
      public boolean erTom();


      /**
       * Setter inn et element i tabellen
       * @param   element             elementet som settes inn
       * @throws  FullTabellUnntak    hvis tabellen allerede er full
       */
      public void settInn(T element);

      /**
       * Henter (uten aa fjerne) et element fra tabellen
       * @param  plass    plassen i tabellen som det hentes fra
       * @return          elementet paa plassen
       * @throws  UgyldigPlassUnntak  hvis plassen ikke er en gyldig
                                      indeks i arrayet eller plassen
                                      ikke inneholder noe element
       */
      public T hentFraPlass(int plass);
