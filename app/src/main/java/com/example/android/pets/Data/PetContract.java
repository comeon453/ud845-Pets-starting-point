package com.example.android.pets.Data;

import android.provider.BaseColumns;

/**
 * Created by oogunyinka on 21/08/2017.
 */

public final class PetContract {

    private PetContract() {
    }


    public static final class PetEntry implements BaseColumns {
        /**
         * Name of database table for pets
         */
        public final static String TABLE_NAME = "pets";

        /**
         * Unique ID number for the pet (only for use in the database table).
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         * Type: TEXT
         */
        public final static String COLUMN_PET_NAME = "name";

        /**
         * Breed of the pet
         * Type: TEXT
         */
        public final static String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         * The only possible values are {@link //#GENDER_UNKNOWN}, {@link //#GENDER_MALE},
         * or {@link //#GENDER_FEMALE}.
         * Type: INTEGER
         */
        public final static String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         * Type: INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";






        //GENDER constants
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
        public final static int GENDER_UNKNOWN = 0;
    }


}
