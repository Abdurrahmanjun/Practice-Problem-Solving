package leetcode

/**
 * may assume each input only have exactly one solution
 *
 * @param nums integer array input
 * @param target integer target sum
 * @return Single IntArray with contain only 2 elements, element represent position
 */
class TwoSum {

    fun solution(nums : IntArray, target: Int): IntArray {
        var i = 0;
        val map = HashMap<Int,Int>()
        val output = IntArray(2)

        while (i < nums.size) {
            if (map.containsKey(target - nums[i])) {
                output[1] = i
                output[0] = map.get(target - nums[i])!!
                break
            }
            map.put(nums[i],i)
            i++
        }
        return output
    }

}

///Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50890:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/charsets.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/cldrdata.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/dnsns.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/jaccess.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/jfxrt.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/localedata.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/nashorn.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/sunec.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/ext/zipfs.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/jce.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/jfr.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/jfxswt.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/jsse.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/management-agent.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/resources.jar:/Users/abdurrahmanjun/Library/Java/JavaVirtualMachines/corretto-1.8.0_322/Contents/Home/jre/lib/rt.jar:/Users/abdurrahmanjun/Documents/INTELLIJ/Practice-Problem-Solving/build/classes/kotlin/main:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter/5.8.1/73a218cf02d36d4e87bb9697fdbe0780e92b6bd3/junit-jupiter-5.8.1.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.5.10/3f4af7aff21c4ec46e3cdd645639d0a63a68d3d0/kotlin-stdlib-jdk8-1.5.10.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-params/5.8.1/13afdb5d414cbe991fce3ef6b864de77c9644dae/junit-jupiter-params-5.8.1.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-api/5.8.1/6538b88eb8bf8811bc7b6efb5246f835c15e0bfe/junit-jupiter-api-5.8.1.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.5.10/c49d0703d16c6cb1526cc07b9b46486da1dd8a60/kotlin-stdlib-jdk7-1.5.10.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.10/da6a904b132f0402fa4d79169a3c1770598d4702/kotlin-stdlib-1.5.10.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.junit.platform/junit-platform-commons/1.8.1/1e362cbe6d0f225b066757865e233972557484/junit-platform-commons-1.8.1.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.opentest4j/opentest4j/1.2.0/28c11eb91f9b6d8e200631d46e20a7f407f2a046/opentest4j-1.2.0.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/Users/abdurrahmanjun/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.10/6b84d926e28493be69daf673e40076f89492ef7/kotlin-stdlib-common-1.5.10.jar leetcode.MoveZeroesKt
//i 1
//nums[i] 1
//index 0
//index++ 1
//
//i 3
//nums[i] 3
//index 1
//index++ 2
//
//i 4
//nums[i] 12
//index 2
//index++ 3
//
//
//Process finished with exit code 0

