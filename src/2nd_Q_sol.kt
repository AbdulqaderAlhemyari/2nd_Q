fun main()
{
    var arabCities= listOf("Sana'a","Cairo","Bierut")
    var asianCities= arrayOf("Mumbai","Bejein","Tokyo")
    var eurpeanCities= mutableListOf("Madrid","London","Paris")

    for ((index,value) in asianCities.withIndex())
    {
        println("in the index" + index + ":\t the city is " + value)
    }
    for (item in arabCities.iterator())
    {
        println(item)
    }
    for (element in eurpeanCities.indices)
    {
        println(eurpeanCities[element])
    }
}