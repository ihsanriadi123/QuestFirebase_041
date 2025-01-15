package com.example.applicationfirebasefilestore.data

import com.example.applicationfirebasefilestore.ui.viewmodel.Skripsi


class JadwalSkripsi<Jadwal>(private val jadwalDao: Skripsi) {
    val allJadwal = jadwalDao.getAlljadwALSkripsi()

    suspend fun insert(jadwal: Jadwal, jadwalSkripsi: Any) {
        jadwalSkripsi.insert(jadwal)
    }

    suspend fun delete(jadwal: Jadwal) {
        jadwalDao.delete(jadwal)
    }

    suspend fun update(jadwal: Jadwal) {
        jadwalDao.update(jadwal)
    }

    suspend fun getJadwalById(id: Int): Jadwal? {
        return jadwalDao.getJadwalById(id)
    }
}
