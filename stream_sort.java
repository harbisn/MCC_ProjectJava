/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Firli
 */
public class sortStream {
    public static void main(String[] args) {
        List names = Arrays.asList("Reflection","Collection","Stream");
//        menggunakan sort pada stream
        List<String> show
                = (List<String>) names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
//        hasil output mengurutkan abjad dari a-z
           
           System.out.println("===============");
//           tanpa menggunakan stream
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; 
        Arrays.sort(arr);

        System.out.printf("Modifikasi"
                + " arr[] : %s",
                Arrays.toString(arr));           
    }
}
