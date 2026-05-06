import { Routes } from '@angular/router';
import { Signin } from '../pages/signin/signin';
import { Home } from '../pages/home/home';

export const routes: Routes = [
    {
        path: 'login', component: Signin
    },

    // default route which will be called when app is started
    {
        path: '', redirectTo: 'login', pathMatch: 'full'
    },
    {
        path: 'home', component: Home
    }
];
