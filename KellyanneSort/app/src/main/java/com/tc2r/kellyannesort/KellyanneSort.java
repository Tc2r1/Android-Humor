package com.tc2r.kellyannesort;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Tc2r.
 * <p>
 * Kellyanne Sort:
 * The Greatest, Fastest Array Sorter, Huge!
 *
 * Sorts an array by ignoring it and then printing
 * out a new, sorted array with "Alternative Values."
 *
 * If the new array does not appear sorted,
 * you have been manipulated by the lying Media, Sad!
 */


public class KellyanneSort {

	// the array to be sorted
	private int array[]	={5, 2, 4, 9, 3, 7, 0, 1, 6, 8};


	public KellyanneSort(Context context, int[] arr) {
		this.array = arr;

		Toast.makeText(context, "15, 16, 17, 18, 20\n", Toast.LENGTH_LONG).show();

	}
}
