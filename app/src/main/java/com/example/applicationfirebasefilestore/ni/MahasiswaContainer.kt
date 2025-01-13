package com.example.applicationfirebasefilestore.ni


import com.example.applicationfirebasefilestore.Repository.RepositoryMhs
import com.example.firebase.repository.NetworkRepositoryMhs
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer{
    val repositoryMhs: RepositoryMhs
}


class MahasiswaContainer: AppContainer{
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    override val repositoryMhs: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}