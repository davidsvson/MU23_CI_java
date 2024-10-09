package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void canGetUserNameById() {
        //given
        UserDao userDau = mock(UserDao.class);
        User expectedUSer = new User(1, "David");
        when(userDau.findById(1)).thenReturn(expectedUSer);
        UserService userService = new UserService(userDau);


        //when
        String name = userService.getUserNameById(1);

        //then
        assertEquals("David", name);
        verify(userDau).findById(1);

    }


}