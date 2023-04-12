<template>
    <div class="board-detail">
        <div class="common-buttons">
            <button type="button" class="w3-button w3-round w3-blue-gray" v-on:click="fnSave">save</button>&nbsp;
            <button type="button" class="w3-button w3-round w3-gray" v-on:click="fnList">list</button>
        </div>
        <div class="board-contents">
            <input type="text" v-model="title" class="w3-input w3-border" placeholder="Please enter the subject.">
            <input type="text" v-model="author" class="w3-input w3-border" placeholder="Please enter the author." v-if="idx === undefined">
        </div>
        <div class="board-contents">
            <textarea id="" cols="30" rows="10" v-model="contents" class="w3-input w3-border" style="resize: none;">
      </textarea>
        </div>
        <div class="common-buttons">
            <button type="button" class="w3-button w3-round w3-blue-gray" v-on:click="fnSave">save</button>&nbsp;
            <button type="button" class="w3-button w3-round w3-gray" v-on:click="fnList">list</button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            requestBody: this.$route.query,
            idx: this.$route.query.idx,

            title: '',
            author: '',
            contents: '',
            created_at: ''
        }
    },
    mounted() {
        this.fnGetView()
    },
    methods: {
        fnGetView() {
            if (this.idx !== undefined) {
                this.$axios.get(this.$serverUrl + '/board/' + this.idx, {
                    params: this.requestBody
                }).then((res) => {
                    this.title = res.data.title
                    this.author = res.data.author
                    this.contents = res.data.contents
                    this.created_at = res.data.created_at
                }).catch((err) => {
                    console.log(err)
                })
            }
        },
        fnList() {
            delete this.requestBody.idx
            this.$router.push({
                path: './list',
                query: this.requestBody
            })
        },
        fnView(idx) {
            this.requestBody.idx = idx
            this.$router.push({
                path: './detail',
                query: this.requestBody
            })
        },
        fnSave() {
            let apiUrl = this.$serverUrl + '/board'
            this.form = {
                "idx": this.idx,
                "title": this.title,
                "contents": this.contents,
                "author": this.author
            }

            if (this.idx === undefined) {
                //INSERT
                this.$axios.post(apiUrl, this.form).then((res) => {
                    alert('Your post has been saved.')
                    this.fnView(res.data.idx)
                }).catch((err) => {
                    if (err.message.indexOf('Network Error') > -1) {
                        alert('The network is not working.\nPlease try again later.')
                    }
                })
            } else {
                //UPDATE
                this.$axios.patch(apiUrl, this.form).then((res) => {
                    alert('Your post has been saved.')
                    this.fnView(res.data.idx)
                }).catch((err) => {
                    if (err.message.indexOf('Network Error') > -1) {
                        alert('The network is not working.\nPlease try again later.')
                    }
                })
            }
        }
    }    
}
</script>
<style scoped>
</style>