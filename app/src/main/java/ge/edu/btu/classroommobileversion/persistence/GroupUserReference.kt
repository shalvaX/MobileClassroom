package ge.edu.btu.classroommobileversion.persistence

import androidx.room.Entity

@Entity(primaryKeys = ["userId", "groupId"])
data class GroupUserReference (
        val userId: Int,
        val groupId: Int
        )