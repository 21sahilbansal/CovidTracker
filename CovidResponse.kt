package com.social.covidindiatracker.network.dataClasses


import com.google.gson.annotations.SerializedName

data class CovidResponse(
    @SerializedName("Andaman and Nicobar Islands")
    val andamanAndNicobarIslands: AndamanAndNicobarIslands?,
    @SerializedName("Andhra Pradesh")
    val andhraPradesh: AndhraPradesh?,
    @SerializedName("Arunachal Pradesh")
    val arunachalPradesh: ArunachalPradesh?,
    @SerializedName("Assam")
    val assam: Assam?,
    @SerializedName("Bihar")
    val bihar: Bihar?,
    @SerializedName("Chandigarh")
    val chandigarh: Chandigarh?,
    @SerializedName("Chhattisgarh")
    val chhattisgarh: Chhattisgarh?,
    @SerializedName("Dadra and Nagar Haveli and Daman and Diu")
    val dadraAndNagarHaveliAndDamanAndDiu: DadraAndNagarHaveliAndDamanAndDiu?,
    @SerializedName("Delhi")
    val delhi: Delhi?,
    @SerializedName("Goa")
    val goa: Goa?,
    @SerializedName("Gujarat")
    val gujarat: Gujarat?,
    @SerializedName("Haryana")
    val haryana: Haryana?,
    @SerializedName("Himachal Pradesh")
    val himachalPradesh: HimachalPradesh?,
    @SerializedName("Jammu and Kashmir")
    val jammuAndKashmir: JammuAndKashmir?,
    @SerializedName("Jharkhand")
    val jharkhand: Jharkhand?,
    @SerializedName("Karnataka")
    val karnataka: Karnataka?,
    @SerializedName("Kerala")
    val kerala: Kerala?,
    @SerializedName("Ladakh")
    val ladakh: Ladakh?,
    @SerializedName("Lakshadweep")
    val lakshadweep: Lakshadweep?,
    @SerializedName("Madhya Pradesh")
    val madhyaPradesh: MadhyaPradesh?,
    @SerializedName("Maharashtra")
    val maharashtra: Maharashtra?,
    @SerializedName("Manipur")
    val manipur: Manipur?,
    @SerializedName("Meghalaya")
    val meghalaya: Meghalaya?,
    @SerializedName("Mizoram")
    val mizoram: Mizoram?,
    @SerializedName("Nagaland")
    val nagaland: Nagaland?,
    @SerializedName("Odisha")
    val odisha: Odisha?,
    @SerializedName("Puducherry")
    val puducherry: Puducherry?,
    @SerializedName("Punjab")
    val punjab: Punjab?,
    @SerializedName("Rajasthan")
    val rajasthan: Rajasthan?,
    @SerializedName("Sikkim")
    val sikkim: Sikkim?,
    @SerializedName("State Unassigned")
    val stateUnassigned: StateUnassigned?,
    @SerializedName("Tamil Nadu")
    val tamilNadu: TamilNadu?,
    @SerializedName("Telangana")
    val telangana: Telangana?,
    @SerializedName("Tripura")
    val tripura: Tripura?,
    @SerializedName("Uttar Pradesh")
    val uttarPradesh: UttarPradesh?,
    @SerializedName("Uttarakhand")
    val uttarakhand: Uttarakhand?,
    @SerializedName("West Bengal")
    val westBengal: WestBengal?
) {
    data class AndamanAndNicobarIslands(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Nicobars")
            val nicobars: Nicobars?,
            @SerializedName("North and Middle Andaman")
            val northAndMiddleAndaman: NorthAndMiddleAndaman?,
            @SerializedName("South Andaman")
            val southAndaman: SouthAndaman?,
            @SerializedName("Unknown")
            val unknown: Unknown?
        ) {
            data class Nicobars(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthAndMiddleAndaman(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthAndaman(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class AndhraPradesh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Anantapur")
            val anantapur: Anantapur?,
            @SerializedName("Chittoor")
            val chittoor: Chittoor?,
            @SerializedName("East Godavari")
            val eastGodavari: EastGodavari?,
            @SerializedName("Foreign Evacuees")
            val foreignEvacuees: ForeignEvacuees?,
            @SerializedName("Guntur")
            val guntur: Guntur?,
            @SerializedName("Krishna")
            val krishna: Krishna?,
            @SerializedName("Kurnool")
            val kurnool: Kurnool?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Prakasam")
            val prakasam: Prakasam?,
            @SerializedName("S.P.S. Nellore")
            val sPSNellore: SPSNellore?,
            @SerializedName("Srikakulam")
            val srikakulam: Srikakulam?,
            @SerializedName("Visakhapatnam")
            val visakhapatnam: Visakhapatnam?,
            @SerializedName("Vizianagaram")
            val vizianagaram: Vizianagaram?,
            @SerializedName("West Godavari")
            val westGodavari: WestGodavari?,
            @SerializedName("Y.S.R. Kadapa")
            val ySRKadapa: YSRKadapa?
        ) {
            data class Anantapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chittoor(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastGodavari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ForeignEvacuees(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Guntur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Krishna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kurnool(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Prakasam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SPSNellore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Srikakulam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Visakhapatnam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vizianagaram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestGodavari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class YSRKadapa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class ArunachalPradesh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Anjaw")
            val anjaw: Anjaw?,
            @SerializedName("Changlang")
            val changlang: Changlang?,
            @SerializedName("East Kameng")
            val eastKameng: EastKameng?,
            @SerializedName("East Siang")
            val eastSiang: EastSiang?,
            @SerializedName("Kamle")
            val kamle: Kamle?,
            @SerializedName("Kra Daadi")
            val kraDaadi: KraDaadi?,
            @SerializedName("Kurung Kumey")
            val kurungKumey: KurungKumey?,
            @SerializedName("Lepa Rada")
            val lepaRada: LepaRada?,
            @SerializedName("Lohit")
            val lohit: Lohit?,
            @SerializedName("Longding")
            val longding: Longding?,
            @SerializedName("Lower Dibang Valley")
            val lowerDibangValley: LowerDibangValley?,
            @SerializedName("Lower Siang")
            val lowerSiang: LowerSiang?,
            @SerializedName("Lower Subansiri")
            val lowerSubansiri: LowerSubansiri?,
            @SerializedName("Namsai")
            val namsai: Namsai?,
            @SerializedName("Pakke Kessang")
            val pakkeKessang: PakkeKessang?,
            @SerializedName("Papum Pare")
            val papumPare: PapumPare?,
            @SerializedName("Shi Yomi")
            val shiYomi: ShiYomi?,
            @SerializedName("Siang")
            val siang: Siang?,
            @SerializedName("Tawang")
            val tawang: Tawang?,
            @SerializedName("Tirap")
            val tirap: Tirap?,
            @SerializedName("Upper Dibang Valley")
            val upperDibangValley: UpperDibangValley?,
            @SerializedName("Upper Siang")
            val upperSiang: UpperSiang?,
            @SerializedName("Upper Subansiri")
            val upperSubansiri: UpperSubansiri?,
            @SerializedName("West Kameng")
            val westKameng: WestKameng?,
            @SerializedName("West Siang")
            val westSiang: WestSiang?
        ) {
            data class Anjaw(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Changlang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastKameng(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastSiang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kamle(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KraDaadi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KurungKumey(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LepaRada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lohit(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Longding(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LowerDibangValley(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LowerSiang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LowerSubansiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Namsai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PakkeKessang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PapumPare(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ShiYomi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Siang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tawang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tirap(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UpperDibangValley(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UpperSiang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UpperSubansiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestKameng(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestSiang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Assam(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Airport Quarantine")
            val airportQuarantine: AirportQuarantine?,
            @SerializedName("Baksa")
            val baksa: Baksa?,
            @SerializedName("Barpeta")
            val barpeta: Barpeta?,
            @SerializedName("Biswanath")
            val biswanath: Biswanath?,
            @SerializedName("Bongaigaon")
            val bongaigaon: Bongaigaon?,
            @SerializedName("Cachar")
            val cachar: Cachar?,
            @SerializedName("Charaideo")
            val charaideo: Charaideo?,
            @SerializedName("Chirang")
            val chirang: Chirang?,
            @SerializedName("Darrang")
            val darrang: Darrang?,
            @SerializedName("Dhemaji")
            val dhemaji: Dhemaji?,
            @SerializedName("Dhubri")
            val dhubri: Dhubri?,
            @SerializedName("Dibrugarh")
            val dibrugarh: Dibrugarh?,
            @SerializedName("Dima Hasao")
            val dimaHasao: DimaHasao?,
            @SerializedName("Goalpara")
            val goalpara: Goalpara?,
            @SerializedName("Golaghat")
            val golaghat: Golaghat?,
            @SerializedName("Hailakandi")
            val hailakandi: Hailakandi?,
            @SerializedName("Hojai")
            val hojai: Hojai?,
            @SerializedName("Jorhat")
            val jorhat: Jorhat?,
            @SerializedName("Kamrup")
            val kamrup: Kamrup?,
            @SerializedName("Kamrup Metropolitan")
            val kamrupMetropolitan: KamrupMetropolitan?,
            @SerializedName("Karbi Anglong")
            val karbiAnglong: KarbiAnglong?,
            @SerializedName("Karimganj")
            val karimganj: Karimganj?,
            @SerializedName("Kokrajhar")
            val kokrajhar: Kokrajhar?,
            @SerializedName("Lakhimpur")
            val lakhimpur: Lakhimpur?,
            @SerializedName("Majuli")
            val majuli: Majuli?,
            @SerializedName("Morigaon")
            val morigaon: Morigaon?,
            @SerializedName("Nagaon")
            val nagaon: Nagaon?,
            @SerializedName("Nalbari")
            val nalbari: Nalbari?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Sivasagar")
            val sivasagar: Sivasagar?,
            @SerializedName("Sonitpur")
            val sonitpur: Sonitpur?,
            @SerializedName("South Salmara Mankachar")
            val southSalmaraMankachar: SouthSalmaraMankachar?,
            @SerializedName("Tinsukia")
            val tinsukia: Tinsukia?,
            @SerializedName("Udalguri")
            val udalguri: Udalguri?,
            @SerializedName("Unknown")
            val unknown: Unknown?,
            @SerializedName("West Karbi Anglong")
            val westKarbiAnglong: WestKarbiAnglong?
        ) {
            data class AirportQuarantine(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Baksa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Barpeta(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Biswanath(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bongaigaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Cachar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Charaideo(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chirang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Darrang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhemaji(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhubri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dibrugarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class DimaHasao(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Goalpara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Golaghat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hailakandi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hojai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jorhat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kamrup(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KamrupMetropolitan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KarbiAnglong(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Karimganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kokrajhar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lakhimpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Majuli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Morigaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nagaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nalbari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sivasagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sonitpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthSalmaraMankachar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tinsukia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Udalguri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestKarbiAnglong(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Bihar(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Araria")
            val araria: Araria?,
            @SerializedName("Arwal")
            val arwal: Arwal?,
            @SerializedName("Aurangabad")
            val aurangabad: Aurangabad?,
            @SerializedName("Banka")
            val banka: Banka?,
            @SerializedName("Begusarai")
            val begusarai: Begusarai?,
            @SerializedName("Bhagalpur")
            val bhagalpur: Bhagalpur?,
            @SerializedName("Bhojpur")
            val bhojpur: Bhojpur?,
            @SerializedName("Buxar")
            val buxar: Buxar?,
            @SerializedName("Darbhanga")
            val darbhanga: Darbhanga?,
            @SerializedName("East Champaran")
            val eastChamparan: EastChamparan?,
            @SerializedName("Gaya")
            val gaya: Gaya?,
            @SerializedName("Gopalganj")
            val gopalganj: Gopalganj?,
            @SerializedName("Jamui")
            val jamui: Jamui?,
            @SerializedName("Jehanabad")
            val jehanabad: Jehanabad?,
            @SerializedName("Kaimur")
            val kaimur: Kaimur?,
            @SerializedName("Katihar")
            val katihar: Katihar?,
            @SerializedName("Khagaria")
            val khagaria: Khagaria?,
            @SerializedName("Kishanganj")
            val kishanganj: Kishanganj?,
            @SerializedName("Lakhisarai")
            val lakhisarai: Lakhisarai?,
            @SerializedName("Madhepura")
            val madhepura: Madhepura?,
            @SerializedName("Madhubani")
            val madhubani: Madhubani?,
            @SerializedName("Munger")
            val munger: Munger?,
            @SerializedName("Muzaffarpur")
            val muzaffarpur: Muzaffarpur?,
            @SerializedName("Nalanda")
            val nalanda: Nalanda?,
            @SerializedName("Nawada")
            val nawada: Nawada?,
            @SerializedName("Patna")
            val patna: Patna?,
            @SerializedName("Purnia")
            val purnia: Purnia?,
            @SerializedName("Rohtas")
            val rohtas: Rohtas?,
            @SerializedName("Saharsa")
            val saharsa: Saharsa?,
            @SerializedName("Samastipur")
            val samastipur: Samastipur?,
            @SerializedName("Saran")
            val saran: Saran?,
            @SerializedName("Sheikhpura")
            val sheikhpura: Sheikhpura?,
            @SerializedName("Sheohar")
            val sheohar: Sheohar?,
            @SerializedName("Sitamarhi")
            val sitamarhi: Sitamarhi?,
            @SerializedName("Siwan")
            val siwan: Siwan?,
            @SerializedName("Supaul")
            val supaul: Supaul?,
            @SerializedName("Vaishali")
            val vaishali: Vaishali?,
            @SerializedName("West Champaran")
            val westChamparan: WestChamparan?
        ) {
            data class Araria(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Arwal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Aurangabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Banka(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Begusarai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhagalpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhojpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Buxar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Darbhanga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastChamparan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gaya(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gopalganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jamui(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jehanabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kaimur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Katihar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khagaria(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kishanganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lakhisarai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Madhepura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Madhubani(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Munger(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Muzaffarpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nalanda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nawada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Patna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Purnia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rohtas(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Saharsa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Samastipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Saran(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sheikhpura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sheohar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sitamarhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Siwan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Supaul(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vaishali(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestChamparan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Chandigarh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Chandigarh")
            val chandigarh: Chandigarh?,
            @SerializedName("Unknown")
            val unknown: Unknown?
        ) {
            data class Chandigarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Chhattisgarh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Balod")
            val balod: Balod?,
            @SerializedName("Baloda Bazar")
            val balodaBazar: BalodaBazar?,
            @SerializedName("Balrampur")
            val balrampur: Balrampur?,
            @SerializedName("Bametara")
            val bametara: Bametara?,
            @SerializedName("Bastar")
            val bastar: Bastar?,
            @SerializedName("Bijapur")
            val bijapur: Bijapur?,
            @SerializedName("Bilaspur")
            val bilaspur: Bilaspur?,
            @SerializedName("Dakshin Bastar Dantewada")
            val dakshinBastarDantewada: DakshinBastarDantewada?,
            @SerializedName("Dhamtari")
            val dhamtari: Dhamtari?,
            @SerializedName("Durg")
            val durg: Durg?,
            @SerializedName("Gariaband")
            val gariaband: Gariaband?,
            @SerializedName("Gaurela Pendra Marwahi")
            val gaurelaPendraMarwahi: GaurelaPendraMarwahi?,
            @SerializedName("Janjgir Champa")
            val janjgirChampa: JanjgirChampa?,
            @SerializedName("Jashpur")
            val jashpur: Jashpur?,
            @SerializedName("Kabeerdham")
            val kabeerdham: Kabeerdham?,
            @SerializedName("Kondagaon")
            val kondagaon: Kondagaon?,
            @SerializedName("Korba")
            val korba: Korba?,
            @SerializedName("Koriya")
            val koriya: Koriya?,
            @SerializedName("Mahasamund")
            val mahasamund: Mahasamund?,
            @SerializedName("Mungeli")
            val mungeli: Mungeli?,
            @SerializedName("Narayanpur")
            val narayanpur: Narayanpur?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Raigarh")
            val raigarh: Raigarh?,
            @SerializedName("Raipur")
            val raipur: Raipur?,
            @SerializedName("Rajnandgaon")
            val rajnandgaon: Rajnandgaon?,
            @SerializedName("Sukma")
            val sukma: Sukma?,
            @SerializedName("Surajpur")
            val surajpur: Surajpur?,
            @SerializedName("Surguja")
            val surguja: Surguja?,
            @SerializedName("Uttar Bastar Kanker")
            val uttarBastarKanker: UttarBastarKanker?
        ) {
            data class Balod(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class BalodaBazar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Balrampur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bametara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bastar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bijapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bilaspur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class DakshinBastarDantewada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhamtari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Durg(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gariaband(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class GaurelaPendraMarwahi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class JanjgirChampa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jashpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kabeerdham(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kondagaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Korba(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Koriya(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahasamund(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mungeli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Narayanpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Raigarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Raipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rajnandgaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sukma(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Surajpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Surguja(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UttarBastarKanker(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class DadraAndNagarHaveliAndDamanAndDiu(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Dadra and Nagar Haveli")
            val dadraAndNagarHaveli: DadraAndNagarHaveli?,
            @SerializedName("Daman")
            val daman: Daman?,
            @SerializedName("Diu")
            val diu: Diu?,
            @SerializedName("Other State")
            val otherState: OtherState?
        ) {
            data class DadraAndNagarHaveli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Daman(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Diu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Delhi(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Central Delhi")
            val centralDelhi: CentralDelhi?,
            @SerializedName("East Delhi")
            val eastDelhi: EastDelhi?,
            @SerializedName("New Delhi")
            val newDelhi: NewDelhi?,
            @SerializedName("North Delhi")
            val northDelhi: NorthDelhi?,
            @SerializedName("North East Delhi")
            val northEastDelhi: NorthEastDelhi?,
            @SerializedName("North West Delhi")
            val northWestDelhi: NorthWestDelhi?,
            @SerializedName("Shahdara")
            val shahdara: Shahdara?,
            @SerializedName("South Delhi")
            val southDelhi: SouthDelhi?,
            @SerializedName("South East Delhi")
            val southEastDelhi: SouthEastDelhi?,
            @SerializedName("South West Delhi")
            val southWestDelhi: SouthWestDelhi?,
            @SerializedName("Unknown")
            val unknown: Unknown?,
            @SerializedName("West Delhi")
            val westDelhi: WestDelhi?
        ) {
            data class CentralDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NewDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthEastDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthWestDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shahdara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthEastDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthWestDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestDelhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Goa(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("North Goa")
            val northGoa: NorthGoa?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("South Goa")
            val southGoa: SouthGoa?,
            @SerializedName("Unknown")
            val unknown: Unknown?
        ) {
            data class NorthGoa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthGoa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Gujarat(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Ahmedabad")
            val ahmedabad: Ahmedabad?,
            @SerializedName("Amreli")
            val amreli: Amreli?,
            @SerializedName("Anand")
            val anand: Anand?,
            @SerializedName("Aravalli")
            val aravalli: Aravalli?,
            @SerializedName("Banaskantha")
            val banaskantha: Banaskantha?,
            @SerializedName("Bharuch")
            val bharuch: Bharuch?,
            @SerializedName("Bhavnagar")
            val bhavnagar: Bhavnagar?,
            @SerializedName("Botad")
            val botad: Botad?,
            @SerializedName("Chhota Udaipur")
            val chhotaUdaipur: ChhotaUdaipur?,
            @SerializedName("Dahod")
            val dahod: Dahod?,
            @SerializedName("Dang")
            val dang: Dang?,
            @SerializedName("Devbhumi Dwarka")
            val devbhumiDwarka: DevbhumiDwarka?,
            @SerializedName("Gandhinagar")
            val gandhinagar: Gandhinagar?,
            @SerializedName("Gir Somnath")
            val girSomnath: GirSomnath?,
            @SerializedName("Jamnagar")
            val jamnagar: Jamnagar?,
            @SerializedName("Junagadh")
            val junagadh: Junagadh?,
            @SerializedName("Kheda")
            val kheda: Kheda?,
            @SerializedName("Kutch")
            val kutch: Kutch?,
            @SerializedName("Mahisagar")
            val mahisagar: Mahisagar?,
            @SerializedName("Mehsana")
            val mehsana: Mehsana?,
            @SerializedName("Morbi")
            val morbi: Morbi?,
            @SerializedName("Narmada")
            val narmada: Narmada?,
            @SerializedName("Navsari")
            val navsari: Navsari?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Panchmahal")
            val panchmahal: Panchmahal?,
            @SerializedName("Patan")
            val patan: Patan?,
            @SerializedName("Porbandar")
            val porbandar: Porbandar?,
            @SerializedName("Rajkot")
            val rajkot: Rajkot?,
            @SerializedName("Sabarkantha")
            val sabarkantha: Sabarkantha?,
            @SerializedName("Surat")
            val surat: Surat?,
            @SerializedName("Surendranagar")
            val surendranagar: Surendranagar?,
            @SerializedName("Tapi")
            val tapi: Tapi?,
            @SerializedName("Vadodara")
            val vadodara: Vadodara?,
            @SerializedName("Valsad")
            val valsad: Valsad?
        ) {
            data class Ahmedabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Amreli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Anand(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Aravalli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Banaskantha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bharuch(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhavnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Botad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ChhotaUdaipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dahod(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class DevbhumiDwarka(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gandhinagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class GirSomnath(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jamnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Junagadh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kheda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kutch(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahisagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mehsana(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Morbi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Narmada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Navsari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Panchmahal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Patan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Porbandar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rajkot(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sabarkantha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Surat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Surendranagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tapi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vadodara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Valsad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Haryana(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Ambala")
            val ambala: Ambala?,
            @SerializedName("Bhiwani")
            val bhiwani: Bhiwani?,
            @SerializedName("Charkhi Dadri")
            val charkhiDadri: CharkhiDadri?,
            @SerializedName("Faridabad")
            val faridabad: Faridabad?,
            @SerializedName("Fatehabad")
            val fatehabad: Fatehabad?,
            @SerializedName("Foreign Evacuees")
            val foreignEvacuees: ForeignEvacuees?,
            @SerializedName("Gurugram")
            val gurugram: Gurugram?,
            @SerializedName("Hisar")
            val hisar: Hisar?,
            @SerializedName("Italians")
            val italians: Italians?,
            @SerializedName("Jhajjar")
            val jhajjar: Jhajjar?,
            @SerializedName("Jind")
            val jind: Jind?,
            @SerializedName("Kaithal")
            val kaithal: Kaithal?,
            @SerializedName("Karnal")
            val karnal: Karnal?,
            @SerializedName("Kurukshetra")
            val kurukshetra: Kurukshetra?,
            @SerializedName("Mahendragarh")
            val mahendragarh: Mahendragarh?,
            @SerializedName("Nuh")
            val nuh: Nuh?,
            @SerializedName("Palwal")
            val palwal: Palwal?,
            @SerializedName("Panchkula")
            val panchkula: Panchkula?,
            @SerializedName("Panipat")
            val panipat: Panipat?,
            @SerializedName("Rewari")
            val rewari: Rewari?,
            @SerializedName("Rohtak")
            val rohtak: Rohtak?,
            @SerializedName("Sirsa")
            val sirsa: Sirsa?,
            @SerializedName("Sonipat")
            val sonipat: Sonipat?,
            @SerializedName("Yamunanagar")
            val yamunanagar: Yamunanagar?
        ) {
            data class Ambala(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhiwani(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class CharkhiDadri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Faridabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Fatehabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ForeignEvacuees(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gurugram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hisar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Italians(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhajjar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jind(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kaithal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Karnal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kurukshetra(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahendragarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nuh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Palwal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Panchkula(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Panipat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rewari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rohtak(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sirsa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sonipat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Yamunanagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class HimachalPradesh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Bilaspur")
            val bilaspur: Bilaspur?,
            @SerializedName("Chamba")
            val chamba: Chamba?,
            @SerializedName("Hamirpur")
            val hamirpur: Hamirpur?,
            @SerializedName("Kangra")
            val kangra: Kangra?,
            @SerializedName("Kinnaur")
            val kinnaur: Kinnaur?,
            @SerializedName("Kullu")
            val kullu: Kullu?,
            @SerializedName("Lahaul and Spiti")
            val lahaulAndSpiti: LahaulAndSpiti?,
            @SerializedName("Mandi")
            val mandi: Mandi?,
            @SerializedName("Shimla")
            val shimla: Shimla?,
            @SerializedName("Sirmaur")
            val sirmaur: Sirmaur?,
            @SerializedName("Solan")
            val solan: Solan?,
            @SerializedName("Una")
            val una: Una?
        ) {
            data class Bilaspur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chamba(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hamirpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kangra(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kinnaur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kullu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LahaulAndSpiti(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mandi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shimla(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sirmaur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Solan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Una(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class JammuAndKashmir(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Anantnag")
            val anantnag: Anantnag?,
            @SerializedName("Bandipora")
            val bandipora: Bandipora?,
            @SerializedName("Baramulla")
            val baramulla: Baramulla?,
            @SerializedName("Budgam")
            val budgam: Budgam?,
            @SerializedName("Doda")
            val doda: Doda?,
            @SerializedName("Ganderbal")
            val ganderbal: Ganderbal?,
            @SerializedName("Jammu")
            val jammu: Jammu?,
            @SerializedName("Kathua")
            val kathua: Kathua?,
            @SerializedName("Kishtwar")
            val kishtwar: Kishtwar?,
            @SerializedName("Kulgam")
            val kulgam: Kulgam?,
            @SerializedName("Kupwara")
            val kupwara: Kupwara?,
            @SerializedName("Mirpur")
            val mirpur: Mirpur?,
            @SerializedName("Muzaffarabad")
            val muzaffarabad: Muzaffarabad?,
            @SerializedName("Pulwama")
            val pulwama: Pulwama?,
            @SerializedName("Punch")
            val punch: Punch?,
            @SerializedName("Rajouri")
            val rajouri: Rajouri?,
            @SerializedName("Ramban")
            val ramban: Ramban?,
            @SerializedName("Reasi")
            val reasi: Reasi?,
            @SerializedName("Samba")
            val samba: Samba?,
            @SerializedName("Shopiyan")
            val shopiyan: Shopiyan?,
            @SerializedName("Srinagar")
            val srinagar: Srinagar?,
            @SerializedName("Udhampur")
            val udhampur: Udhampur?
        ) {
            data class Anantnag(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bandipora(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Baramulla(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Budgam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Doda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ganderbal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jammu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kathua(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kishtwar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kulgam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kupwara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mirpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Muzaffarabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pulwama(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Punch(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rajouri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ramban(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Reasi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Samba(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shopiyan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Srinagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Udhampur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Jharkhand(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Bokaro")
            val bokaro: Bokaro?,
            @SerializedName("Chatra")
            val chatra: Chatra?,
            @SerializedName("Deoghar")
            val deoghar: Deoghar?,
            @SerializedName("Dhanbad")
            val dhanbad: Dhanbad?,
            @SerializedName("Dumka")
            val dumka: Dumka?,
            @SerializedName("East Singhbhum")
            val eastSinghbhum: EastSinghbhum?,
            @SerializedName("Garhwa")
            val garhwa: Garhwa?,
            @SerializedName("Giridih")
            val giridih: Giridih?,
            @SerializedName("Godda")
            val godda: Godda?,
            @SerializedName("Gumla")
            val gumla: Gumla?,
            @SerializedName("Hazaribagh")
            val hazaribagh: Hazaribagh?,
            @SerializedName("Jamtara")
            val jamtara: Jamtara?,
            @SerializedName("Khunti")
            val khunti: Khunti?,
            @SerializedName("Koderma")
            val koderma: Koderma?,
            @SerializedName("Latehar")
            val latehar: Latehar?,
            @SerializedName("Lohardaga")
            val lohardaga: Lohardaga?,
            @SerializedName("Pakur")
            val pakur: Pakur?,
            @SerializedName("Palamu")
            val palamu: Palamu?,
            @SerializedName("Ramgarh")
            val ramgarh: Ramgarh?,
            @SerializedName("Ranchi")
            val ranchi: Ranchi?,
            @SerializedName("Sahibganj")
            val sahibganj: Sahibganj?,
            @SerializedName("Saraikela-Kharsawan")
            val saraikelaKharsawan: SaraikelaKharsawan?,
            @SerializedName("Simdega")
            val simdega: Simdega?,
            @SerializedName("West Singhbhum")
            val westSinghbhum: WestSinghbhum?
        ) {
            data class Bokaro(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chatra(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Deoghar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhanbad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dumka(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastSinghbhum(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Garhwa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Giridih(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Godda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gumla(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hazaribagh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jamtara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khunti(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Koderma(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Latehar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lohardaga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pakur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Palamu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ramgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ranchi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sahibganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SaraikelaKharsawan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Simdega(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestSinghbhum(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Karnataka(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Bagalkote")
            val bagalkote: Bagalkote?,
            @SerializedName("Ballari")
            val ballari: Ballari?,
            @SerializedName("Belagavi")
            val belagavi: Belagavi?,
            @SerializedName("Bengaluru Rural")
            val bengaluruRural: BengaluruRural?,
            @SerializedName("Bengaluru Urban")
            val bengaluruUrban: BengaluruUrban?,
            @SerializedName("Bidar")
            val bidar: Bidar?,
            @SerializedName("Chamarajanagara")
            val chamarajanagara: Chamarajanagara?,
            @SerializedName("Chikkaballapura")
            val chikkaballapura: Chikkaballapura?,
            @SerializedName("Chikkamagaluru")
            val chikkamagaluru: Chikkamagaluru?,
            @SerializedName("Chitradurga")
            val chitradurga: Chitradurga?,
            @SerializedName("Dakshina Kannada")
            val dakshinaKannada: DakshinaKannada?,
            @SerializedName("Davanagere")
            val davanagere: Davanagere?,
            @SerializedName("Dharwad")
            val dharwad: Dharwad?,
            @SerializedName("Gadag")
            val gadag: Gadag?,
            @SerializedName("Hassan")
            val hassan: Hassan?,
            @SerializedName("Haveri")
            val haveri: Haveri?,
            @SerializedName("Kalaburagi")
            val kalaburagi: Kalaburagi?,
            @SerializedName("Kodagu")
            val kodagu: Kodagu?,
            @SerializedName("Kolar")
            val kolar: Kolar?,
            @SerializedName("Koppal")
            val koppal: Koppal?,
            @SerializedName("Mandya")
            val mandya: Mandya?,
            @SerializedName("Mysuru")
            val mysuru: Mysuru?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Raichur")
            val raichur: Raichur?,
            @SerializedName("Ramanagara")
            val ramanagara: Ramanagara?,
            @SerializedName("Shivamogga")
            val shivamogga: Shivamogga?,
            @SerializedName("Tumakuru")
            val tumakuru: Tumakuru?,
            @SerializedName("Udupi")
            val udupi: Udupi?,
            @SerializedName("Uttara Kannada")
            val uttaraKannada: UttaraKannada?,
            @SerializedName("Vijayapura")
            val vijayapura: Vijayapura?,
            @SerializedName("Yadgir")
            val yadgir: Yadgir?
        ) {
            data class Bagalkote(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ballari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Belagavi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class BengaluruRural(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class BengaluruUrban(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bidar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chamarajanagara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chikkaballapura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chikkamagaluru(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chitradurga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class DakshinaKannada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Davanagere(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dharwad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gadag(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hassan(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Haveri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kalaburagi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kodagu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kolar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Koppal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mandya(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mysuru(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Raichur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ramanagara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shivamogga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tumakuru(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Udupi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UttaraKannada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vijayapura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Yadgir(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Kerala(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Alappuzha")
            val alappuzha: Alappuzha?,
            @SerializedName("Ernakulam")
            val ernakulam: Ernakulam?,
            @SerializedName("Idukki")
            val idukki: Idukki?,
            @SerializedName("Kannur")
            val kannur: Kannur?,
            @SerializedName("Kasaragod")
            val kasaragod: Kasaragod?,
            @SerializedName("Kollam")
            val kollam: Kollam?,
            @SerializedName("Kottayam")
            val kottayam: Kottayam?,
            @SerializedName("Kozhikode")
            val kozhikode: Kozhikode?,
            @SerializedName("Malappuram")
            val malappuram: Malappuram?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Palakkad")
            val palakkad: Palakkad?,
            @SerializedName("Pathanamthitta")
            val pathanamthitta: Pathanamthitta?,
            @SerializedName("Thiruvananthapuram")
            val thiruvananthapuram: Thiruvananthapuram?,
            @SerializedName("Thrissur")
            val thrissur: Thrissur?,
            @SerializedName("Wayanad")
            val wayanad: Wayanad?
        ) {
            data class Alappuzha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ernakulam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Idukki(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kannur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kasaragod(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kollam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kottayam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kozhikode(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Malappuram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Palakkad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pathanamthitta(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thiruvananthapuram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thrissur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Wayanad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Ladakh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Kargil")
            val kargil: Kargil?,
            @SerializedName("Leh")
            val leh: Leh?
        ) {
            data class Kargil(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Leh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Lakshadweep(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Lakshadweep")
            val lakshadweep: Lakshadweep?,
            @SerializedName("Unknown")
            val unknown: Unknown?
        ) {
            data class Lakshadweep(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class MadhyaPradesh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Agar Malwa")
            val agarMalwa: AgarMalwa?,
            @SerializedName("Alirajpur")
            val alirajpur: Alirajpur?,
            @SerializedName("Anuppur")
            val anuppur: Anuppur?,
            @SerializedName("Ashoknagar")
            val ashoknagar: Ashoknagar?,
            @SerializedName("Balaghat")
            val balaghat: Balaghat?,
            @SerializedName("Barwani")
            val barwani: Barwani?,
            @SerializedName("Betul")
            val betul: Betul?,
            @SerializedName("Bhind")
            val bhind: Bhind?,
            @SerializedName("Bhopal")
            val bhopal: Bhopal?,
            @SerializedName("Burhanpur")
            val burhanpur: Burhanpur?,
            @SerializedName("Chhatarpur")
            val chhatarpur: Chhatarpur?,
            @SerializedName("Chhindwara")
            val chhindwara: Chhindwara?,
            @SerializedName("Damoh")
            val damoh: Damoh?,
            @SerializedName("Datia")
            val datia: Datia?,
            @SerializedName("Dewas")
            val dewas: Dewas?,
            @SerializedName("Dhar")
            val dhar: Dhar?,
            @SerializedName("Dindori")
            val dindori: Dindori?,
            @SerializedName("Guna")
            val guna: Guna?,
            @SerializedName("Gwalior")
            val gwalior: Gwalior?,
            @SerializedName("Harda")
            val harda: Harda?,
            @SerializedName("Hoshangabad")
            val hoshangabad: Hoshangabad?,
            @SerializedName("Indore")
            val indore: Indore?,
            @SerializedName("Jabalpur")
            val jabalpur: Jabalpur?,
            @SerializedName("Jhabua")
            val jhabua: Jhabua?,
            @SerializedName("Katni")
            val katni: Katni?,
            @SerializedName("Khandwa")
            val khandwa: Khandwa?,
            @SerializedName("Khargone")
            val khargone: Khargone?,
            @SerializedName("Mandla")
            val mandla: Mandla?,
            @SerializedName("Mandsaur")
            val mandsaur: Mandsaur?,
            @SerializedName("Morena")
            val morena: Morena?,
            @SerializedName("Narsinghpur")
            val narsinghpur: Narsinghpur?,
            @SerializedName("Neemuch")
            val neemuch: Neemuch?,
            @SerializedName("Niwari")
            val niwari: Niwari?,
            @SerializedName("Other Region")
            val otherRegion: OtherRegion?,
            @SerializedName("Panna")
            val panna: Panna?,
            @SerializedName("Raisen")
            val raisen: Raisen?,
            @SerializedName("Rajgarh")
            val rajgarh: Rajgarh?,
            @SerializedName("Ratlam")
            val ratlam: Ratlam?,
            @SerializedName("Rewa")
            val rewa: Rewa?,
            @SerializedName("Sagar")
            val sagar: Sagar?,
            @SerializedName("Satna")
            val satna: Satna?,
            @SerializedName("Sehore")
            val sehore: Sehore?,
            @SerializedName("Seoni")
            val seoni: Seoni?,
            @SerializedName("Shahdol")
            val shahdol: Shahdol?,
            @SerializedName("Shajapur")
            val shajapur: Shajapur?,
            @SerializedName("Sheopur")
            val sheopur: Sheopur?,
            @SerializedName("Shivpuri")
            val shivpuri: Shivpuri?,
            @SerializedName("Sidhi")
            val sidhi: Sidhi?,
            @SerializedName("Singrauli")
            val singrauli: Singrauli?,
            @SerializedName("Tikamgarh")
            val tikamgarh: Tikamgarh?,
            @SerializedName("Ujjain")
            val ujjain: Ujjain?,
            @SerializedName("Umaria")
            val umaria: Umaria?,
            @SerializedName("Vidisha")
            val vidisha: Vidisha?
        ) {
            data class AgarMalwa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Alirajpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Anuppur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ashoknagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Balaghat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Barwani(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Betul(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhind(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhopal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Burhanpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chhatarpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chhindwara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Damoh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Datia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dewas(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dindori(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Guna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gwalior(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Harda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hoshangabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Indore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jabalpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhabua(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Katni(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khandwa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khargone(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mandla(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mandsaur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Morena(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Narsinghpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Neemuch(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Niwari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherRegion(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Panna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Raisen(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rajgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ratlam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rewa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Satna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sehore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Seoni(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shahdol(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shajapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sheopur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shivpuri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sidhi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Singrauli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tikamgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ujjain(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Umaria(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vidisha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Maharashtra(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Ahmednagar")
            val ahmednagar: Ahmednagar?,
            @SerializedName("Akola")
            val akola: Akola?,
            @SerializedName("Amravati")
            val amravati: Amravati?,
            @SerializedName("Aurangabad")
            val aurangabad: Aurangabad?,
            @SerializedName("Beed")
            val beed: Beed?,
            @SerializedName("Bhandara")
            val bhandara: Bhandara?,
            @SerializedName("Buldhana")
            val buldhana: Buldhana?,
            @SerializedName("Chandrapur")
            val chandrapur: Chandrapur?,
            @SerializedName("Dhule")
            val dhule: Dhule?,
            @SerializedName("Gadchiroli")
            val gadchiroli: Gadchiroli?,
            @SerializedName("Gondia")
            val gondia: Gondia?,
            @SerializedName("Hingoli")
            val hingoli: Hingoli?,
            @SerializedName("Jalgaon")
            val jalgaon: Jalgaon?,
            @SerializedName("Jalna")
            val jalna: Jalna?,
            @SerializedName("Kolhapur")
            val kolhapur: Kolhapur?,
            @SerializedName("Latur")
            val latur: Latur?,
            @SerializedName("Mumbai")
            val mumbai: Mumbai?,
            @SerializedName("Mumbai Suburban")
            val mumbaiSuburban: MumbaiSuburban?,
            @SerializedName("Nagpur")
            val nagpur: Nagpur?,
            @SerializedName("Nanded")
            val nanded: Nanded?,
            @SerializedName("Nandurbar")
            val nandurbar: Nandurbar?,
            @SerializedName("Nashik")
            val nashik: Nashik?,
            @SerializedName("Osmanabad")
            val osmanabad: Osmanabad?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Palghar")
            val palghar: Palghar?,
            @SerializedName("Parbhani")
            val parbhani: Parbhani?,
            @SerializedName("Pune")
            val pune: Pune?,
            @SerializedName("Raigad")
            val raigad: Raigad?,
            @SerializedName("Ratnagiri")
            val ratnagiri: Ratnagiri?,
            @SerializedName("Sangli")
            val sangli: Sangli?,
            @SerializedName("Satara")
            val satara: Satara?,
            @SerializedName("Sindhudurg")
            val sindhudurg: Sindhudurg?,
            @SerializedName("Solapur")
            val solapur: Solapur?,
            @SerializedName("Thane")
            val thane: Thane?,
            @SerializedName("Wardha")
            val wardha: Wardha?,
            @SerializedName("Washim")
            val washim: Washim?,
            @SerializedName("Yavatmal")
            val yavatmal: Yavatmal?
        ) {
            data class Ahmednagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Akola(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Amravati(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Aurangabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Beed(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhandara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Buldhana(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chandrapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhule(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gadchiroli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gondia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hingoli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalgaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalna(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kolhapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Latur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mumbai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class MumbaiSuburban(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nagpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nanded(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nandurbar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nashik(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Osmanabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Palghar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Parbhani(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pune(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Raigad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ratnagiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sangli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Satara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sindhudurg(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Solapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thane(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Wardha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Washim(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Yavatmal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Manipur(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Bishnupur")
            val bishnupur: Bishnupur?,
            @SerializedName("CAPF Personnel")
            val cAPFPersonnel: CAPFPersonnel?,
            @SerializedName("Chandel")
            val chandel: Chandel?,
            @SerializedName("Churachandpur")
            val churachandpur: Churachandpur?,
            @SerializedName("Imphal East")
            val imphalEast: ImphalEast?,
            @SerializedName("Imphal West")
            val imphalWest: ImphalWest?,
            @SerializedName("Jiribam")
            val jiribam: Jiribam?,
            @SerializedName("Kakching")
            val kakching: Kakching?,
            @SerializedName("Kamjong")
            val kamjong: Kamjong?,
            @SerializedName("Kangpokpi")
            val kangpokpi: Kangpokpi?,
            @SerializedName("Noney")
            val noney: Noney?,
            @SerializedName("Pherzawl")
            val pherzawl: Pherzawl?,
            @SerializedName("Senapati")
            val senapati: Senapati?,
            @SerializedName("Tamenglong")
            val tamenglong: Tamenglong?,
            @SerializedName("Tengnoupal")
            val tengnoupal: Tengnoupal?,
            @SerializedName("Thoubal")
            val thoubal: Thoubal?,
            @SerializedName("Ukhrul")
            val ukhrul: Ukhrul?,
            @SerializedName("Unknown")
            val unknown: Unknown?
        ) {
            data class Bishnupur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class CAPFPersonnel(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chandel(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Churachandpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ImphalEast(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ImphalWest(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jiribam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kakching(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kamjong(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kangpokpi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Noney(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pherzawl(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Senapati(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tamenglong(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tengnoupal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thoubal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ukhrul(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Meghalaya(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("East Garo Hills")
            val eastGaroHills: EastGaroHills?,
            @SerializedName("East Jaintia Hills")
            val eastJaintiaHills: EastJaintiaHills?,
            @SerializedName("East Khasi Hills")
            val eastKhasiHills: EastKhasiHills?,
            @SerializedName("North Garo Hills")
            val northGaroHills: NorthGaroHills?,
            @SerializedName("Ribhoi")
            val ribhoi: Ribhoi?,
            @SerializedName("South Garo Hills")
            val southGaroHills: SouthGaroHills?,
            @SerializedName("South West Garo Hills")
            val southWestGaroHills: SouthWestGaroHills?,
            @SerializedName("South West Khasi Hills")
            val southWestKhasiHills: SouthWestKhasiHills?,
            @SerializedName("West Garo Hills")
            val westGaroHills: WestGaroHills?,
            @SerializedName("West Jaintia Hills")
            val westJaintiaHills: WestJaintiaHills?,
            @SerializedName("West Khasi Hills")
            val westKhasiHills: WestKhasiHills?
        ) {
            data class EastGaroHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastJaintiaHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class EastKhasiHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthGaroHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ribhoi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthGaroHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthWestGaroHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthWestKhasiHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestGaroHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestJaintiaHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestKhasiHills(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Mizoram(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Aizawl")
            val aizawl: Aizawl?,
            @SerializedName("Champhai")
            val champhai: Champhai?,
            @SerializedName("Hnahthial")
            val hnahthial: Hnahthial?,
            @SerializedName("Khawzawl")
            val khawzawl: Khawzawl?,
            @SerializedName("Kolasib")
            val kolasib: Kolasib?,
            @SerializedName("Lawngtlai")
            val lawngtlai: Lawngtlai?,
            @SerializedName("Lunglei")
            val lunglei: Lunglei?,
            @SerializedName("Mamit")
            val mamit: Mamit?,
            @SerializedName("Saiha")
            val saiha: Saiha?,
            @SerializedName("Saitual")
            val saitual: Saitual?,
            @SerializedName("Serchhip")
            val serchhip: Serchhip?
        ) {
            data class Aizawl(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Champhai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hnahthial(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khawzawl(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kolasib(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lawngtlai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lunglei(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mamit(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Saiha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Saitual(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Serchhip(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Nagaland(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Dimapur")
            val dimapur: Dimapur?,
            @SerializedName("Kiphire")
            val kiphire: Kiphire?,
            @SerializedName("Kohima")
            val kohima: Kohima?,
            @SerializedName("Longleng")
            val longleng: Longleng?,
            @SerializedName("Mokokchung")
            val mokokchung: Mokokchung?,
            @SerializedName("Mon")
            val mon: Mon?,
            @SerializedName("Others")
            val others: Others?,
            @SerializedName("Peren")
            val peren: Peren?,
            @SerializedName("Phek")
            val phek: Phek?,
            @SerializedName("Tuensang")
            val tuensang: Tuensang?,
            @SerializedName("Wokha")
            val wokha: Wokha?,
            @SerializedName("Zunheboto")
            val zunheboto: Zunheboto?
        ) {
            data class Dimapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kiphire(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kohima(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Longleng(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mokokchung(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Others(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Peren(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Phek(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tuensang(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Wokha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Zunheboto(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Odisha(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Angul")
            val angul: Angul?,
            @SerializedName("Balangir")
            val balangir: Balangir?,
            @SerializedName("Balasore")
            val balasore: Balasore?,
            @SerializedName("Bargarh")
            val bargarh: Bargarh?,
            @SerializedName("Bhadrak")
            val bhadrak: Bhadrak?,
            @SerializedName("Boudh")
            val boudh: Boudh?,
            @SerializedName("Cuttack")
            val cuttack: Cuttack?,
            @SerializedName("Deogarh")
            val deogarh: Deogarh?,
            @SerializedName("Dhenkanal")
            val dhenkanal: Dhenkanal?,
            @SerializedName("Gajapati")
            val gajapati: Gajapati?,
            @SerializedName("Ganjam")
            val ganjam: Ganjam?,
            @SerializedName("Jagatsinghpur")
            val jagatsinghpur: Jagatsinghpur?,
            @SerializedName("Jajpur")
            val jajpur: Jajpur?,
            @SerializedName("Jharsuguda")
            val jharsuguda: Jharsuguda?,
            @SerializedName("Kalahandi")
            val kalahandi: Kalahandi?,
            @SerializedName("Kandhamal")
            val kandhamal: Kandhamal?,
            @SerializedName("Kendrapara")
            val kendrapara: Kendrapara?,
            @SerializedName("Kendujhar")
            val kendujhar: Kendujhar?,
            @SerializedName("Khordha")
            val khordha: Khordha?,
            @SerializedName("Koraput")
            val koraput: Koraput?,
            @SerializedName("Malkangiri")
            val malkangiri: Malkangiri?,
            @SerializedName("Mayurbhanj")
            val mayurbhanj: Mayurbhanj?,
            @SerializedName("Nabarangapur")
            val nabarangapur: Nabarangapur?,
            @SerializedName("Nayagarh")
            val nayagarh: Nayagarh?,
            @SerializedName("Nuapada")
            val nuapada: Nuapada?,
            @SerializedName("Others")
            val others: Others?,
            @SerializedName("Puri")
            val puri: Puri?,
            @SerializedName("Rayagada")
            val rayagada: Rayagada?,
            @SerializedName("Sambalpur")
            val sambalpur: Sambalpur?,
            @SerializedName("State Pool")
            val statePool: StatePool?,
            @SerializedName("Subarnapur")
            val subarnapur: Subarnapur?,
            @SerializedName("Sundargarh")
            val sundargarh: Sundargarh?
        ) {
            data class Angul(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Balangir(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Balasore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bargarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhadrak(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Boudh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Cuttack(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Deogarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dhenkanal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gajapati(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ganjam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jagatsinghpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jajpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jharsuguda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kalahandi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kandhamal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kendrapara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kendujhar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khordha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Koraput(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Malkangiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mayurbhanj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nabarangapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nayagarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nuapada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Others(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Puri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rayagada(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sambalpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class StatePool(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Subarnapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sundargarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Puducherry(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Karaikal")
            val karaikal: Karaikal?,
            @SerializedName("Mahe")
            val mahe: Mahe?,
            @SerializedName("Puducherry")
            val puducherry: Puducherry?,
            @SerializedName("Yanam")
            val yanam: Yanam?
        ) {
            data class Karaikal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahe(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Puducherry(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Yanam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Punjab(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Amritsar")
            val amritsar: Amritsar?,
            @SerializedName("Barnala")
            val barnala: Barnala?,
            @SerializedName("Bathinda")
            val bathinda: Bathinda?,
            @SerializedName("Faridkot")
            val faridkot: Faridkot?,
            @SerializedName("Fatehgarh Sahib")
            val fatehgarhSahib: FatehgarhSahib?,
            @SerializedName("Fazilka")
            val fazilka: Fazilka?,
            @SerializedName("Ferozepur")
            val ferozepur: Ferozepur?,
            @SerializedName("Gurdaspur")
            val gurdaspur: Gurdaspur?,
            @SerializedName("Hoshiarpur")
            val hoshiarpur: Hoshiarpur?,
            @SerializedName("Jalandhar")
            val jalandhar: Jalandhar?,
            @SerializedName("Kapurthala")
            val kapurthala: Kapurthala?,
            @SerializedName("Ludhiana")
            val ludhiana: Ludhiana?,
            @SerializedName("Mansa")
            val mansa: Mansa?,
            @SerializedName("Moga")
            val moga: Moga?,
            @SerializedName("Pathankot")
            val pathankot: Pathankot?,
            @SerializedName("Patiala")
            val patiala: Patiala?,
            @SerializedName("Rupnagar")
            val rupnagar: Rupnagar?,
            @SerializedName("S.A.S. Nagar")
            val sASNagar: SASNagar?,
            @SerializedName("Sangrur")
            val sangrur: Sangrur?,
            @SerializedName("Shahid Bhagat Singh Nagar")
            val shahidBhagatSinghNagar: ShahidBhagatSinghNagar?,
            @SerializedName("Sri Muktsar Sahib")
            val sriMuktsarSahib: SriMuktsarSahib?,
            @SerializedName("Tarn Taran")
            val tarnTaran: TarnTaran?
        ) {
            data class Amritsar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Barnala(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bathinda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Faridkot(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class FatehgarhSahib(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Fazilka(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ferozepur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gurdaspur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hoshiarpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalandhar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kapurthala(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ludhiana(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mansa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Moga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pathankot(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Patiala(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rupnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SASNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sangrur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ShahidBhagatSinghNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SriMuktsarSahib(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class TarnTaran(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Rajasthan(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Ajmer")
            val ajmer: Ajmer?,
            @SerializedName("Alwar")
            val alwar: Alwar?,
            @SerializedName("BSF Camp")
            val bSFCamp: BSFCamp?,
            @SerializedName("Banswara")
            val banswara: Banswara?,
            @SerializedName("Baran")
            val baran: Baran?,
            @SerializedName("Barmer")
            val barmer: Barmer?,
            @SerializedName("Bharatpur")
            val bharatpur: Bharatpur?,
            @SerializedName("Bhilwara")
            val bhilwara: Bhilwara?,
            @SerializedName("Bikaner")
            val bikaner: Bikaner?,
            @SerializedName("Bundi")
            val bundi: Bundi?,
            @SerializedName("Chittorgarh")
            val chittorgarh: Chittorgarh?,
            @SerializedName("Churu")
            val churu: Churu?,
            @SerializedName("Dausa")
            val dausa: Dausa?,
            @SerializedName("Dholpur")
            val dholpur: Dholpur?,
            @SerializedName("Dungarpur")
            val dungarpur: Dungarpur?,
            @SerializedName("Evacuees")
            val evacuees: Evacuees?,
            @SerializedName("Ganganagar")
            val ganganagar: Ganganagar?,
            @SerializedName("Hanumangarh")
            val hanumangarh: Hanumangarh?,
            @SerializedName("Italians")
            val italians: Italians?,
            @SerializedName("Jaipur")
            val jaipur: Jaipur?,
            @SerializedName("Jaisalmer")
            val jaisalmer: Jaisalmer?,
            @SerializedName("Jalore")
            val jalore: Jalore?,
            @SerializedName("Jhalawar")
            val jhalawar: Jhalawar?,
            @SerializedName("Jhunjhunu")
            val jhunjhunu: Jhunjhunu?,
            @SerializedName("Jodhpur")
            val jodhpur: Jodhpur?,
            @SerializedName("Karauli")
            val karauli: Karauli?,
            @SerializedName("Kota")
            val kota: Kota?,
            @SerializedName("Nagaur")
            val nagaur: Nagaur?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Pali")
            val pali: Pali?,
            @SerializedName("Pratapgarh")
            val pratapgarh: Pratapgarh?,
            @SerializedName("Rajsamand")
            val rajsamand: Rajsamand?,
            @SerializedName("Sawai Madhopur")
            val sawaiMadhopur: SawaiMadhopur?,
            @SerializedName("Sikar")
            val sikar: Sikar?,
            @SerializedName("Sirohi")
            val sirohi: Sirohi?,
            @SerializedName("Tonk")
            val tonk: Tonk?,
            @SerializedName("Udaipur")
            val udaipur: Udaipur?
        ) {
            data class Ajmer(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Alwar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class BSFCamp(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Banswara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Baran(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Barmer(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bharatpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhilwara(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bikaner(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bundi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chittorgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Churu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dausa(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dholpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dungarpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Evacuees(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ganganagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hanumangarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Italians(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jaipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jaisalmer(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhalawar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhunjhunu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jodhpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Karauli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kota(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nagaur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pali(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pratapgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rajsamand(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SawaiMadhopur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sikar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sirohi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tonk(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Udaipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Sikkim(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("East Sikkim")
            val eastSikkim: EastSikkim?,
            @SerializedName("North Sikkim")
            val northSikkim: NorthSikkim?,
            @SerializedName("South Sikkim")
            val southSikkim: SouthSikkim?,
            @SerializedName("Unknown")
            val unknown: Unknown?,
            @SerializedName("West Sikkim")
            val westSikkim: WestSikkim?
        ) {
            data class EastSikkim(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthSikkim(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthSikkim(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestSikkim(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class StateUnassigned(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Unassigned")
            val unassigned: Unassigned?
        ) {
            data class Unassigned(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class TamilNadu(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Airport Quarantine")
            val airportQuarantine: AirportQuarantine?,
            @SerializedName("Ariyalur")
            val ariyalur: Ariyalur?,
            @SerializedName("Chengalpattu")
            val chengalpattu: Chengalpattu?,
            @SerializedName("Chennai")
            val chennai: Chennai?,
            @SerializedName("Coimbatore")
            val coimbatore: Coimbatore?,
            @SerializedName("Cuddalore")
            val cuddalore: Cuddalore?,
            @SerializedName("Dharmapuri")
            val dharmapuri: Dharmapuri?,
            @SerializedName("Dindigul")
            val dindigul: Dindigul?,
            @SerializedName("Erode")
            val erode: Erode?,
            @SerializedName("Kallakurichi")
            val kallakurichi: Kallakurichi?,
            @SerializedName("Kancheepuram")
            val kancheepuram: Kancheepuram?,
            @SerializedName("Kanyakumari")
            val kanyakumari: Kanyakumari?,
            @SerializedName("Karur")
            val karur: Karur?,
            @SerializedName("Krishnagiri")
            val krishnagiri: Krishnagiri?,
            @SerializedName("Madurai")
            val madurai: Madurai?,
            @SerializedName("Nagapattinam")
            val nagapattinam: Nagapattinam?,
            @SerializedName("Namakkal")
            val namakkal: Namakkal?,
            @SerializedName("Nilgiris")
            val nilgiris: Nilgiris?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Perambalur")
            val perambalur: Perambalur?,
            @SerializedName("Pudukkottai")
            val pudukkottai: Pudukkottai?,
            @SerializedName("Railway Quarantine")
            val railwayQuarantine: RailwayQuarantine?,
            @SerializedName("Ramanathapuram")
            val ramanathapuram: Ramanathapuram?,
            @SerializedName("Ranipet")
            val ranipet: Ranipet?,
            @SerializedName("Salem")
            val salem: Salem?,
            @SerializedName("Sivaganga")
            val sivaganga: Sivaganga?,
            @SerializedName("Tenkasi")
            val tenkasi: Tenkasi?,
            @SerializedName("Thanjavur")
            val thanjavur: Thanjavur?,
            @SerializedName("Theni")
            val theni: Theni?,
            @SerializedName("Thiruvallur")
            val thiruvallur: Thiruvallur?,
            @SerializedName("Thiruvarur")
            val thiruvarur: Thiruvarur?,
            @SerializedName("Thoothukkudi")
            val thoothukkudi: Thoothukkudi?,
            @SerializedName("Tiruchirappalli")
            val tiruchirappalli: Tiruchirappalli?,
            @SerializedName("Tirunelveli")
            val tirunelveli: Tirunelveli?,
            @SerializedName("Tirupathur")
            val tirupathur: Tirupathur?,
            @SerializedName("Tiruppur")
            val tiruppur: Tiruppur?,
            @SerializedName("Tiruvannamalai")
            val tiruvannamalai: Tiruvannamalai?,
            @SerializedName("Vellore")
            val vellore: Vellore?,
            @SerializedName("Viluppuram")
            val viluppuram: Viluppuram?,
            @SerializedName("Virudhunagar")
            val virudhunagar: Virudhunagar?
        ) {
            data class AirportQuarantine(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ariyalur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chengalpattu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chennai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Coimbatore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Cuddalore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dharmapuri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dindigul(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Erode(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kallakurichi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kancheepuram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kanyakumari(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Karur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Krishnagiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Madurai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nagapattinam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Namakkal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nilgiris(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Perambalur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pudukkottai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class RailwayQuarantine(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ramanathapuram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ranipet(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Salem(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sivaganga(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tenkasi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thanjavur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Theni(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thiruvallur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thiruvarur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Thoothukkudi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tiruchirappalli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tirunelveli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tirupathur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tiruppur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Tiruvannamalai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vellore(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Viluppuram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Virudhunagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Telangana(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Adilabad")
            val adilabad: Adilabad?,
            @SerializedName("Bhadradri Kothagudem")
            val bhadradriKothagudem: BhadradriKothagudem?,
            @SerializedName("Foreign Evacuees")
            val foreignEvacuees: ForeignEvacuees?,
            @SerializedName("Hyderabad")
            val hyderabad: Hyderabad?,
            @SerializedName("Jagtial")
            val jagtial: Jagtial?,
            @SerializedName("Jangaon")
            val jangaon: Jangaon?,
            @SerializedName("Jayashankar Bhupalapally")
            val jayashankarBhupalapally: JayashankarBhupalapally?,
            @SerializedName("Jogulamba Gadwal")
            val jogulambaGadwal: JogulambaGadwal?,
            @SerializedName("Kamareddy")
            val kamareddy: Kamareddy?,
            @SerializedName("Karimnagar")
            val karimnagar: Karimnagar?,
            @SerializedName("Khammam")
            val khammam: Khammam?,
            @SerializedName("Komaram Bheem")
            val komaramBheem: KomaramBheem?,
            @SerializedName("Mahabubabad")
            val mahabubabad: Mahabubabad?,
            @SerializedName("Mahabubnagar")
            val mahabubnagar: Mahabubnagar?,
            @SerializedName("Mancherial")
            val mancherial: Mancherial?,
            @SerializedName("Medak")
            val medak: Medak?,
            @SerializedName("Medchal Malkajgiri")
            val medchalMalkajgiri: MedchalMalkajgiri?,
            @SerializedName("Mulugu")
            val mulugu: Mulugu?,
            @SerializedName("Nagarkurnool")
            val nagarkurnool: Nagarkurnool?,
            @SerializedName("Nalgonda")
            val nalgonda: Nalgonda?,
            @SerializedName("Narayanpet")
            val narayanpet: Narayanpet?,
            @SerializedName("Nirmal")
            val nirmal: Nirmal?,
            @SerializedName("Nizamabad")
            val nizamabad: Nizamabad?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Peddapalli")
            val peddapalli: Peddapalli?,
            @SerializedName("Rajanna Sircilla")
            val rajannaSircilla: RajannaSircilla?,
            @SerializedName("Ranga Reddy")
            val rangaReddy: RangaReddy?,
            @SerializedName("Sangareddy")
            val sangareddy: Sangareddy?,
            @SerializedName("Siddipet")
            val siddipet: Siddipet?,
            @SerializedName("Suryapet")
            val suryapet: Suryapet?,
            @SerializedName("Unknown")
            val unknown: Unknown?,
            @SerializedName("Vikarabad")
            val vikarabad: Vikarabad?,
            @SerializedName("Wanaparthy")
            val wanaparthy: Wanaparthy?,
            @SerializedName("Warangal Rural")
            val warangalRural: WarangalRural?,
            @SerializedName("Warangal Urban")
            val warangalUrban: WarangalUrban?,
            @SerializedName("Yadadri Bhuvanagiri")
            val yadadriBhuvanagiri: YadadriBhuvanagiri?
        ) {
            data class Adilabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class BhadradriKothagudem(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class ForeignEvacuees(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hyderabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jagtial(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jangaon(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class JayashankarBhupalapally(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class JogulambaGadwal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kamareddy(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Karimnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khammam(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KomaramBheem(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahabubabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahabubnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mancherial(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Medak(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class MedchalMalkajgiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mulugu(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nagarkurnool(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nalgonda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Narayanpet(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nirmal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nizamabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Peddapalli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class RajannaSircilla(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class RangaReddy(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sangareddy(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Siddipet(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Suryapet(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unknown(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Vikarabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Wanaparthy(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WarangalRural(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WarangalUrban(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class YadadriBhuvanagiri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Tripura(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Dhalai")
            val dhalai: Dhalai?,
            @SerializedName("Gomati")
            val gomati: Gomati?,
            @SerializedName("Khowai")
            val khowai: Khowai?,
            @SerializedName("North Tripura")
            val northTripura: NorthTripura?,
            @SerializedName("Sipahijala")
            val sipahijala: Sipahijala?,
            @SerializedName("South Tripura")
            val southTripura: SouthTripura?,
            @SerializedName("Unokoti")
            val unokoti: Unokoti?,
            @SerializedName("West Tripura")
            val westTripura: WestTripura?
        ) {
            data class Dhalai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gomati(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Khowai(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class NorthTripura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sipahijala(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SouthTripura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unokoti(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class WestTripura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class UttarPradesh(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Agra")
            val agra: Agra?,
            @SerializedName("Aligarh")
            val aligarh: Aligarh?,
            @SerializedName("Ambedkar Nagar")
            val ambedkarNagar: AmbedkarNagar?,
            @SerializedName("Amethi")
            val amethi: Amethi?,
            @SerializedName("Amroha")
            val amroha: Amroha?,
            @SerializedName("Auraiya")
            val auraiya: Auraiya?,
            @SerializedName("Ayodhya")
            val ayodhya: Ayodhya?,
            @SerializedName("Azamgarh")
            val azamgarh: Azamgarh?,
            @SerializedName("Baghpat")
            val baghpat: Baghpat?,
            @SerializedName("Bahraich")
            val bahraich: Bahraich?,
            @SerializedName("Ballia")
            val ballia: Ballia?,
            @SerializedName("Balrampur")
            val balrampur: Balrampur?,
            @SerializedName("Banda")
            val banda: Banda?,
            @SerializedName("Barabanki")
            val barabanki: Barabanki?,
            @SerializedName("Bareilly")
            val bareilly: Bareilly?,
            @SerializedName("Basti")
            val basti: Basti?,
            @SerializedName("Bhadohi")
            val bhadohi: Bhadohi?,
            @SerializedName("Bijnor")
            val bijnor: Bijnor?,
            @SerializedName("Budaun")
            val budaun: Budaun?,
            @SerializedName("Bulandshahr")
            val bulandshahr: Bulandshahr?,
            @SerializedName("Chandauli")
            val chandauli: Chandauli?,
            @SerializedName("Chitrakoot")
            val chitrakoot: Chitrakoot?,
            @SerializedName("Deoria")
            val deoria: Deoria?,
            @SerializedName("Etah")
            val etah: Etah?,
            @SerializedName("Etawah")
            val etawah: Etawah?,
            @SerializedName("Farrukhabad")
            val farrukhabad: Farrukhabad?,
            @SerializedName("Fatehpur")
            val fatehpur: Fatehpur?,
            @SerializedName("Firozabad")
            val firozabad: Firozabad?,
            @SerializedName("Gautam Buddha Nagar")
            val gautamBuddhaNagar: GautamBuddhaNagar?,
            @SerializedName("Ghaziabad")
            val ghaziabad: Ghaziabad?,
            @SerializedName("Ghazipur")
            val ghazipur: Ghazipur?,
            @SerializedName("Gonda")
            val gonda: Gonda?,
            @SerializedName("Gorakhpur")
            val gorakhpur: Gorakhpur?,
            @SerializedName("Hamirpur")
            val hamirpur: Hamirpur?,
            @SerializedName("Hapur")
            val hapur: Hapur?,
            @SerializedName("Hardoi")
            val hardoi: Hardoi?,
            @SerializedName("Hathras")
            val hathras: Hathras?,
            @SerializedName("Jalaun")
            val jalaun: Jalaun?,
            @SerializedName("Jaunpur")
            val jaunpur: Jaunpur?,
            @SerializedName("Jhansi")
            val jhansi: Jhansi?,
            @SerializedName("Kannauj")
            val kannauj: Kannauj?,
            @SerializedName("Kanpur Dehat")
            val kanpurDehat: KanpurDehat?,
            @SerializedName("Kanpur Nagar")
            val kanpurNagar: KanpurNagar?,
            @SerializedName("Kasganj")
            val kasganj: Kasganj?,
            @SerializedName("Kaushambi")
            val kaushambi: Kaushambi?,
            @SerializedName("Kushinagar")
            val kushinagar: Kushinagar?,
            @SerializedName("Lakhimpur Kheri")
            val lakhimpurKheri: LakhimpurKheri?,
            @SerializedName("Lalitpur")
            val lalitpur: Lalitpur?,
            @SerializedName("Lucknow")
            val lucknow: Lucknow?,
            @SerializedName("Maharajganj")
            val maharajganj: Maharajganj?,
            @SerializedName("Mahoba")
            val mahoba: Mahoba?,
            @SerializedName("Mainpuri")
            val mainpuri: Mainpuri?,
            @SerializedName("Mathura")
            val mathura: Mathura?,
            @SerializedName("Mau")
            val mau: Mau?,
            @SerializedName("Meerut")
            val meerut: Meerut?,
            @SerializedName("Mirzapur")
            val mirzapur: Mirzapur?,
            @SerializedName("Moradabad")
            val moradabad: Moradabad?,
            @SerializedName("Muzaffarnagar")
            val muzaffarnagar: Muzaffarnagar?,
            @SerializedName("Pilibhit")
            val pilibhit: Pilibhit?,
            @SerializedName("Pratapgarh")
            val pratapgarh: Pratapgarh?,
            @SerializedName("Prayagraj")
            val prayagraj: Prayagraj?,
            @SerializedName("Rae Bareli")
            val raeBareli: RaeBareli?,
            @SerializedName("Rampur")
            val rampur: Rampur?,
            @SerializedName("Saharanpur")
            val saharanpur: Saharanpur?,
            @SerializedName("Sambhal")
            val sambhal: Sambhal?,
            @SerializedName("Sant Kabir Nagar")
            val santKabirNagar: SantKabirNagar?,
            @SerializedName("Shahjahanpur")
            val shahjahanpur: Shahjahanpur?,
            @SerializedName("Shamli")
            val shamli: Shamli?,
            @SerializedName("Shrawasti")
            val shrawasti: Shrawasti?,
            @SerializedName("Siddharthnagar")
            val siddharthnagar: Siddharthnagar?,
            @SerializedName("Sitapur")
            val sitapur: Sitapur?,
            @SerializedName("Sonbhadra")
            val sonbhadra: Sonbhadra?,
            @SerializedName("Sultanpur")
            val sultanpur: Sultanpur?,
            @SerializedName("Unnao")
            val unnao: Unnao?,
            @SerializedName("Varanasi")
            val varanasi: Varanasi?
        ) {
            data class Agra(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Aligarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class AmbedkarNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Amethi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Amroha(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Auraiya(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ayodhya(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Azamgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Baghpat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bahraich(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ballia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Balrampur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Banda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Barabanki(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bareilly(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Basti(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bhadohi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bijnor(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Budaun(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bulandshahr(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chandauli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chitrakoot(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Deoria(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Etah(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Etawah(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Farrukhabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Fatehpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Firozabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class GautamBuddhaNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ghaziabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Ghazipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gonda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Gorakhpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hamirpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hardoi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hathras(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalaun(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jaunpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhansi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kannauj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KanpurDehat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class KanpurNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kasganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kaushambi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kushinagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class LakhimpurKheri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lalitpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Lucknow(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Maharajganj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mahoba(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mainpuri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mathura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mau(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Meerut(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Mirzapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Moradabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Muzaffarnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pilibhit(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pratapgarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Prayagraj(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class RaeBareli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rampur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Saharanpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sambhal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class SantKabirNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shahjahanpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shamli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Shrawasti(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Siddharthnagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sitapur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sonbhadra(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Sultanpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Unnao(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Varanasi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class Uttarakhand(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Almora")
            val almora: Almora?,
            @SerializedName("Bageshwar")
            val bageshwar: Bageshwar?,
            @SerializedName("Chamoli")
            val chamoli: Chamoli?,
            @SerializedName("Champawat")
            val champawat: Champawat?,
            @SerializedName("Dehradun")
            val dehradun: Dehradun?,
            @SerializedName("Haridwar")
            val haridwar: Haridwar?,
            @SerializedName("Nainital")
            val nainital: Nainital?,
            @SerializedName("Pauri Garhwal")
            val pauriGarhwal: PauriGarhwal?,
            @SerializedName("Pithoragarh")
            val pithoragarh: Pithoragarh?,
            @SerializedName("Rudraprayag")
            val rudraprayag: Rudraprayag?,
            @SerializedName("Tehri Garhwal")
            val tehriGarhwal: TehriGarhwal?,
            @SerializedName("Udham Singh Nagar")
            val udhamSinghNagar: UdhamSinghNagar?,
            @SerializedName("Uttarkashi")
            val uttarkashi: Uttarkashi?
        ) {
            data class Almora(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bageshwar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Chamoli(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Champawat(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Dehradun(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Haridwar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nainital(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PauriGarhwal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Pithoragarh(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Rudraprayag(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class TehriGarhwal(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UdhamSinghNagar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Uttarkashi(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }

    data class WestBengal(
        @SerializedName("districtData")
        val districtData: DistrictData?,
        @SerializedName("statecode")
        val statecode: String?
    ) {
        data class DistrictData(
            @SerializedName("Alipurduar")
            val alipurduar: Alipurduar?,
            @SerializedName("Bankura")
            val bankura: Bankura?,
            @SerializedName("Birbhum")
            val birbhum: Birbhum?,
            @SerializedName("Cooch Behar")
            val coochBehar: CoochBehar?,
            @SerializedName("Dakshin Dinajpur")
            val dakshinDinajpur: DakshinDinajpur?,
            @SerializedName("Darjeeling")
            val darjeeling: Darjeeling?,
            @SerializedName("Hooghly")
            val hooghly: Hooghly?,
            @SerializedName("Howrah")
            val howrah: Howrah?,
            @SerializedName("Jalpaiguri")
            val jalpaiguri: Jalpaiguri?,
            @SerializedName("Jhargram")
            val jhargram: Jhargram?,
            @SerializedName("Kalimpong")
            val kalimpong: Kalimpong?,
            @SerializedName("Kolkata")
            val kolkata: Kolkata?,
            @SerializedName("Malda")
            val malda: Malda?,
            @SerializedName("Murshidabad")
            val murshidabad: Murshidabad?,
            @SerializedName("Nadia")
            val nadia: Nadia?,
            @SerializedName("North 24 Parganas")
            val north24Parganas: North24Parganas?,
            @SerializedName("Other State")
            val otherState: OtherState?,
            @SerializedName("Paschim Bardhaman")
            val paschimBardhaman: PaschimBardhaman?,
            @SerializedName("Paschim Medinipur")
            val paschimMedinipur: PaschimMedinipur?,
            @SerializedName("Purba Bardhaman")
            val purbaBardhaman: PurbaBardhaman?,
            @SerializedName("Purba Medinipur")
            val purbaMedinipur: PurbaMedinipur?,
            @SerializedName("Purulia")
            val purulia: Purulia?,
            @SerializedName("South 24 Parganas")
            val south24Parganas: South24Parganas?,
            @SerializedName("Uttar Dinajpur")
            val uttarDinajpur: UttarDinajpur?
        ) {
            data class Alipurduar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Bankura(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Birbhum(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class CoochBehar(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class DakshinDinajpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Darjeeling(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Hooghly(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Howrah(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jalpaiguri(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Jhargram(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kalimpong(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Kolkata(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Malda(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Murshidabad(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Nadia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class North24Parganas(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class OtherState(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PaschimBardhaman(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PaschimMedinipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PurbaBardhaman(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class PurbaMedinipur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class Purulia(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class South24Parganas(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }

            data class UttarDinajpur(
                @SerializedName("active")
                val active: Int?,
                @SerializedName("confirmed")
                val confirmed: Int?,
                @SerializedName("deceased")
                val deceased: Int?,
                @SerializedName("delta")
                val delta: Delta?,
                @SerializedName("notes")
                val notes: String?,
                @SerializedName("recovered")
                val recovered: Int?
            ) {
                data class Delta(
                    @SerializedName("confirmed")
                    val confirmed: Int?,
                    @SerializedName("deceased")
                    val deceased: Int?,
                    @SerializedName("recovered")
                    val recovered: Int?
                )
            }
        }
    }
}
