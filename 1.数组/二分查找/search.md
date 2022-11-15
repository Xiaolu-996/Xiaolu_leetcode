### 二分搜索
> 每右移一位就是除以2,左移一位就是乘以2
> 条件：有序数组且无重复数字
- 左闭右闭区间[left, right]
- 左闭右开区间[left, right)

#### 1.为什么 while 循环的条件中是 <=，而不是 <？
- 搜索区间为空的时候应该终止
- while(left <= right) 的终止条件是 left == right + 1，写成区间的形式就是 [right + 1, right]，
> 或者带个具体的数字进去 [3, 2]，可见这时候区间为空，因为没有数字既大于等于 3 又小于等于 2 的吧。所以这时候 while 循环终止是正确的，直接返回 -1 即可。
- while(left < right) 的终止条件是 left == right，写成区间的形式就是 [right, right]
> 或者带个具体的数字进去 [2, 2]，这时候区间非空，还有一个数 2，但此时 while 循环终止了。也就是说这区间 [2, 2] 被漏掉了，索引 2 没有被搜索，如果这时候直接返回 -1 就是错误的。
### 2.逻辑统一
#### 2.1普通二分搜索
- 因为我们初始化 right = nums.length - 1
- 所以决定了我们的「搜索区间」是 [left, right]
- 所以决定了 while (left <= right)
- 同时也决定了 left = mid+1 和 right = mid-1

- 因为我们只需找到一个 target 的索引即可
- 所以当 nums[mid] == target 时可以立即返回


#### 2.2寻找右侧边界的二分搜索
- 因为我们初始化 right = nums.length
- 所以决定了我们的「搜索区间」是 [left, right)
- 所以决定了 while (left < right)
- 同时也决定了 left = mid + 1 和 right = mid

- 因为我们需找到 target 的最左侧索引
- 所以当 nums[mid] == target 时不要立即返回
- 而要收紧右侧边界以锁定左侧边界


#### 2.3寻找右侧边界的二分搜索
- 因为我们初始化 right = nums.length
- 所以决定了我们的「搜索区间」是 [left, right)
- 所以决定了 while (left < right)
- 同时也决定了 left = mid + 1 和 right = mid

- 因为我们需找到 target 的最右侧索引
- 所以当 nums[mid] == target 时不要立即返回
- 而要收紧左侧边界以锁定右侧边界

- 又因为收紧左侧边界时必须 left = mid + 1
- 所以最后无论返回 left 还是 right，必须减一


