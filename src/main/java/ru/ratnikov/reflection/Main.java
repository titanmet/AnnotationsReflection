package ru.ratnikov.reflection;

import com.sun.istack.internal.NotNull;
import ru.ratnikov.reflection.annotations.Email;
import ru.ratnikov.reflection.annotations.Immutable;
import ru.ratnikov.reflection.annotations.NonEmpty;
import ru.ratnikov.reflection.annotations.Unfinished;


import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"ResultOfMethodCallIgnored", "UnusedReturnValue"})
@Deprecated                                                         //ElementType.TYPE
@Unfinished(
        priority = Unfinished.Priority.LOW,
        value = "too old to rock too young to die",
        lastChanged = "2019-02-02",
        lastChangedBy = "titanmet"
)
public class Main<T extends @Email String> {                        //ElementType.TYPE_USE
    @SuppressWarnings({"unused", "FieldCanBeLocal"})                //ElementType.FIELD
    private final int size;

    @Deprecated                                                     //ElementType.CONSTRUCTOR
    public Main(int size) {
        this.size = size;
    }

    @Deprecated                                                     //ElementType.METHOD
    public static void main(@NotNull String... args) {              //ElementType.PARAMETER
        @NotNull List<String> list =                                //ElementType.LOCAL_VARIABLE
                new @NonEmpty ArrayList<>();                        //ElementType.TYPE_USE

        Main.<@Email String>cast(list);                             //ElementType.TYPE_USE

    }

    private static <@Immutable E> E cast(Object object) {           //ElementType.TYPE_PARAMETER
        //noinspection unchecked
        return (E) object;
    }
}